package com.zzzz.tests;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {

        System.out.println("hello worldz!");

        Faker faker = new Faker();
        System.out.println(faker.name().fullName());

        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));


    }




}
