package com.example.builder;

/**
 * 建造者模式，可以使用lombok插件简化代码
 *
 * @author liushangqing
 * @date 2022/1/5 20:49
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public static Person builder(){
        return new Person();
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person sex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
