package edu.pasadena.cs.cs03b;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
    
    public void printNameAndAge(){
        System.out.println("Hey! My name is " + this.name + " and I am " + this.age + " years old!");
    }
}
