package com.bejing.domain;

/**
 * @Author 小韦
 * @Date 2021/10/16 0:02
 * @Version 1.0
 */
public class YingHang {
    private Integer id;
    private String name;
    private double money;
    private Integer age;

    public YingHang() {
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "YingHang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", age=" + age +
                '}';
    }
}
