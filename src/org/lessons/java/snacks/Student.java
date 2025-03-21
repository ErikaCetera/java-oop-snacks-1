package org.lessons.java.snacks;

public class Student {

    // attributi
    private String firstname;
    private String lastname;
    private int age;

    // capicità

    // costruttore
    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    // metodi di lettura e scrittura

    // nome
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // cognome
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // età
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // concatenazione
    public String getInfoStudent() {
        if(firstname != null && lastname != null){
        String info = firstname + " " + lastname + " " + age;
        return info;
    } else{
        return null;
    }
    }

}