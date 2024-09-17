package com.example;

public class Main {

    //addition
    public static int add(int a, int b){
        return a + b;
    }

    // subtraction
    public static int subtract(int a, int b){
        return a - b;
    }

    //multiplication
    public static int multiply(int a, int b){
        return a * b;
    }

    //division
    public static int divide(int a, int b){
        return a / b;
    }


    public static void main(String[] args) {
        //demostrations
        int sum = add(10,5);
        System.out.println("10 + 5 = " + sum);

        int difference = subtract(10,5);
        System.out.println("10 - 5 = " + difference);

        int product = multiply(10,5);
        System.out.println("10 * 5 = " + product);

        int quotient = divide(10,5);
        System.out.println("10 / 5 = " + quotient);
    }
}