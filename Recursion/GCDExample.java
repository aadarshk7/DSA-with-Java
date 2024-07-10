package Recursion;

import java.util.Scanner;

public class GCDExample {
    public static void main(String args[]) {
        int num1=54;
        int num2=24;
        GCDExample gcd =new GCDExample();
        gcd.GCD(54,24);
        System.out.println("GCD of two numbers " + num1 + " and " + num2 + " is :" + GCD(num1, num2));
    }

    static int GCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return GCD(num2, num1 % num2);
    }
}

