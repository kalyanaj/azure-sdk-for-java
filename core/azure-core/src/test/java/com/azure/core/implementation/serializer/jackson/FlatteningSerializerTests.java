// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.serializer.jackson;

import com.azure.core.implementation.serializer.JsonFlatten;
import com.azure.core.implementation.serializer.SerializerEncoding;
import com.azure.core.implementation.util.Foo;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlatteningSerializerTests {
    @Test
    public void canFlatten() throws Exception {
        Foo foo = new Foo();
        foo.bar("hello.world");
        foo.baz(new ArrayList<>());
        foo.baz().add("hello");
        foo.baz().add("hello.world");
        foo.qux(new HashMap<>());
        foo.qux().put("hello", "world");
        foo.qux().put("a.b", "c.d");
        foo.qux().put("bar.a", "ttyy");
        foo.qux().put("bar.b", "uuzz");
        foo.moreProps("hello");

        JacksonAdapter adapter = new JacksonAdapter();

        // serialization
        String serialized = adapter.serialize(foo, SerializerEncoding.JSON);
        Assert.assertEquals("{\"$type\":\"foo\",\"properties\":{\"bar\":\"hello.world\",\"props\":{\"baz\":[\"hello\",\"hello.world\"],\"q\":{\"qux\":{\"hello\":\"world\",\"a.b\":\"c.d\",\"bar.b\":\"uuzz\",\"bar.a\":\"ttyy\"}}},\"more.props\":\"hello\"}}", serialized);

        // deserialization
        Foo deserialized = adapter.deserialize(serialized, Foo.class, SerializerEncoding.JSON);
        Assert.assertEquals("hello.world", deserialized.bar());
        Assert.assertArrayEquals(new String[]{"hello", "hello.world"}, deserialized.baz().toArray());
        Assert.assertNotNull(deserialized.qux());
        Assert.assertEquals("world", deserialized.qux().get("hello"));
        Assert.assertEquals("c.d", deserialized.qux().get("a.b"));
        Assert.assertEquals("ttyy", deserialized.qux().get("bar.a"));
        Assert.assertEquals("uuzz", deserialized.qux().get("bar.b"));
        Assert.assertEquals("hello", deserialized.moreProps());
    }

    @Test
    public void canSerializeMapKeysWithDotAndSlash() throws Exception {
        String serialized = new JacksonAdapter().serialize(prepareSchoolModel(), SerializerEncoding.JSON);
        Assert.assertEquals("{\"teacher\":{\"students\":{\"af.B/D\":{},\"af.B/C\":{}}},\"tags\":{\"foo.aa\":\"bar\",\"x.y\":\"zz\"},\"properties\":{\"name\":\"school1\"}}", serialized);
    }

    @JsonFlatten
    private class School {
        @JsonProperty(value = "teacher")
        private Teacher teacher;

        @JsonProperty(value = "properties.name")
        private String name;

        @JsonProperty(value = "tags")
        private Map<String, String> tags;

        public School withTeacher(Teacher teacher) {
            this.teacher = teacher;
            return this;
        }

        public School withName(String name) {
            this.name = name;
            return this;
        }

        public School withTags(Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
    }

    private class Student {
    }

    private class Teacher {
        @JsonProperty(value = "students")
        private Map<String, Student> students;

        public Teacher withStudents(Map<String, Student> students) {
            this.students = students;
            return this;
        }
    }

    private School prepareSchoolModel() {
        Teacher teacher = new Teacher();

        Map<String, Student> students = new HashMap<String, Student>();
        students.put("af.B/C", new Student());
        students.put("af.B/D", new Student());

        teacher.withStudents(students);

        School school = new School().withName("school1");
        school.withTeacher(teacher);

        Map<String, String> schoolTags = new HashMap<String, String>();
        schoolTags.put("foo.aa", "bar");
        schoolTags.put("x.y", "zz");

        school.withTags(schoolTags);

        return school;
    }
}
