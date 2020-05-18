package com.company.person;


import com.company.transport.Transport;

public class Person {
    private String id;
    private String p_Name;
    private String p_Sex;
    private int p_Age;

    public void chooseTransport(Transport transport) {
        System.out.print(id+" ");
        transport.drivingMethod();
    }

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }
}
