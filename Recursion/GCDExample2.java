package Recursion;

public class GCDExample2 {
    public static void main(String[] args) {
        int n1 = 54;
        int n2 = 24;
        System.out.println("The GCD of these two numbers is: " + gcd(n1, n2));
    }

    static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

}
