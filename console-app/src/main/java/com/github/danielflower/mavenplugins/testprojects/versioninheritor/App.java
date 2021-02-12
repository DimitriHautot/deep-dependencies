package com.github.danielflower.mavenplugins.testprojects.versioninheritor;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("0 + 42 = " + calculator.add(0, 42));
    }
}
