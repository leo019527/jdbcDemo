package com.lingyao;

public class Person {
    public Person() {
    }

    private String name;
    private String psw;

    public Person(String name, String psw) {
        this.name = name;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "name:"+this.name+"\tpsw:"+this.psw;
    }
}
