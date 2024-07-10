import java.util.*;
public class FactorialR {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial: ");
        int num=sc.nextInt();
        long fact=numbers(num);
        System.out.println("Factorial of "+num+" is:"+" = "+fact);
    }
    public static long numbers(int num) {
        if (num >= 1) {
            return num * numbers(num - 1);
        } else {
            return 1;
        }
    }
}
