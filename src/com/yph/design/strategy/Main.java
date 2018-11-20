package com.yph.design.strategy;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.goToCompany();

        System.out.println("-------------------------------------");
        person.setMethod(new RunMethod());
        person.goToCompany();
        System.out.println("-------------------------------------");
        person.setMethod(new CarMethod());
        person.goToCompany();
        System.out.println("-------------------------------------");
        person.setMethod(new PlaneMethod());
        person.goToCompany();
        System.out.println("-------------------------------------");
        person.setMethod(new DefaultMethod());
        person.goToCompany();
    }
}
