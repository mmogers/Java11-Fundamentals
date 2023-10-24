/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic 2: Nested Classes
Subtopic: Static Nested Classes
*/


import static nest.EnclosingClass.NestedStaticClass;

public class StaticClassExample {
    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        NestedStaticClass.NestedInterface n;

        // Create an instance of the static class
        NestedStaticClass nInstance = new NestedStaticClass();
        System.out.println(nInstance.getInstanceName());

    }
}