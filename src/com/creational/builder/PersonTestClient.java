package com.creational.builder;

/**
 * description
 *
 * @author liushangqing
 * @date 2022/1/5 20:54
 */
public class PersonTestClient {
    public static void main(String[] args) {
        Person person = Person.builder().name("zhangsan").age(12).sex("男");
        System.out.println(person);
    }
}
