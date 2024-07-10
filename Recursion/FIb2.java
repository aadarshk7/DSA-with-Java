package Recursion;

public class FIb2 {
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        System.out.println(a+" "+b);
//        System.out.println(b+" ");
        FIb2 fi2 = new FIb2();
        fi2.fibonacciusingrecurrsion(10);

    }

    void fibonacciusingrecurrsion(int i) {
        if (i >= 0) {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
            fibonacciusingrecurrsion(i - 1);
        }
    }
}

