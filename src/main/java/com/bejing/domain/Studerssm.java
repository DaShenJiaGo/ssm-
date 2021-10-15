package com.bejing.domain;

/**
 * @Author 小韦
 * @Date 2021/10/10 15:08
 * @Version 1.0
 */
public class Studerssm {
    private Integer id;
    private String name;
    private Integer age;

    public Studerssm() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studerssm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
