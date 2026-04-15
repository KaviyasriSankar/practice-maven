package com.example;

public class App {
    public String checkOddEven(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        System.out.println("5 is " + new App().checkOddEven(5));
    }
}
