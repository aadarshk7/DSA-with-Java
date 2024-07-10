package Recursion;

public class BasicRecursion3 {
    public static void main(String[] args) {
        BasicRecursion3 bs3 = new BasicRecursion3();
        bs3.BSTHREE(3, "source", "helper", "destination");
    }

    void BSTHREE(int n, String source, String helper, String destination) {
        if (n <= 0) {
            return;
        } else {
            BSTHREE(n - 1, source, destination, helper);
            System.out.println("disk " + n + " has been moved from " + source + " to " + destination);
            BSTHREE(n - 1, helper, source, destination);
        }
    }
}
