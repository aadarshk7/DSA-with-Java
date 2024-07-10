package Recursion;

public class TOH {
    public static void main(String[] args) {
        TOH towerofhanoi = new TOH();
        towerofhanoi.TowerofHanoi(2, "Source", "Destination", "Helper");

    }

    void TowerofHanoi(int n, String source, String destination, String helper) {
        if (n <= 0) {
            return;
        } else {
            // Sytem.out.println("It shouldn't be zero");;
            TowerofHanoi(n - 1, source, helper, destination);
            System.out.println("Disk " + n + " has been moved from " + source + " to " + destination);
            TowerofHanoi(n - 1, helper, destination, source);
        }
    }


}
