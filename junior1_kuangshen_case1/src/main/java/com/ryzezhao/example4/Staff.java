package com.ryzezhao.example4;

public class Staff {
    private String name;
    private Integer age;

    public Staff() {
        System.out.println("Staff()被创建");
    }

    public Staff(String name, Integer age) {
        System.out.println("Staff(String name, Integer age)被创建");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName()被调用");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("setAge()被调用");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
