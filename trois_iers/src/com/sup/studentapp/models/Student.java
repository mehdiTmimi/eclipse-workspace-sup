package com.sup.studentapp.models;

public class Student{
    private String cin;
    private String nom;
    private int age;

    public Student(){
        super();
    }
    public Student(String cin, String nom, int age){
        super();
        this.cin=cin;
        this.nom=nom;
        this.age=age;
    }
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin=cin;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
}