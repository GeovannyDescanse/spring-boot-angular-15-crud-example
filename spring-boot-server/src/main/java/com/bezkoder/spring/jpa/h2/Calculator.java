package com.bezkoder.spring.jpa.h2;

public class Calculator {

    public static void main(String args[]) {
        System.out.println(suma(785, 967, 325));
        System.out.println(division(641, 82));
    }

    public static Integer suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static Double division(double num1, double num2) {
        return num1 / num2;
    }
}
