package org.example;

import static org.example.Fibonacci.fibonacciIterative;
import static org.example.FibonacciDynamic.fibonacciDynamic;
import static org.example.FibonacciRecursive.fibonacciRecursive;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 12;
        int result1 = fibonacciIterative(n);
        int result2 = fibonacciRecursive(n);
        int result3 = fibonacciDynamic(n);
        System.out.println(n + "th(nd) Number Of fibonacciIterative is: " + result1);
        System.out.println(n + "th(nd) Number Of fibonacciRecursive is: " + result2);
        System.out.println(n + "th(nd) Number Of fibonacciDynamic is: " + result3);
    }
}