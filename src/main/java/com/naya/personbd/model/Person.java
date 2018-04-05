package com.naya.personbd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Evgeny Borisov
 */
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int age;

    @java.beans.ConstructorProperties({"id", "name", "age"})
    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        final Person other = (Person) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getAge() != other.getAge()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $id = this.getId();
        result = result * PRIME + (int) ($id >>> 32 ^ $id);
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getAge();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

    public String toString() {
        return "Person(id=" + this.getId() + ", name=" + this.getName() + ", age=" + this.getAge() + ")";
    }

    public static class PersonBuilder {
        private long id;
        private String name;
        private int age;

        PersonBuilder() {
        }

        public PersonBuilder id(long id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(id, name, age);
        }

        public String toString() {
            return "Person.PersonBuilder(id=" + this.id + ", name=" + this.name + ", age=" + this.age + ")";
        }
    }
}











