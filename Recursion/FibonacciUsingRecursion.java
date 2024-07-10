package Recursion;

public class FibonacciUsingRecursion {
     static int a = 0, b = 1,c;

    public static void main(String[] args) {
        System.out.print(a + " " + b);
        FibonacciUsingRecursion fur = new FibonacciUsingRecursion();
        fur.fibonacci(20);
    }

     void fibonacci(int i) {

        if (i >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibonacci(i - 1);

        }

    }
}
