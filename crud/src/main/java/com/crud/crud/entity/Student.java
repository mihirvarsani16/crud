package com.crud.crud.entity;

public class Student {

    private int en;
    private String name;
    private String standard;

    public Student() {
    }

    public Student(int en, String name, String standard) {
        this.en = en;
        this.name = name;
        this.standard = standard;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

}
