package Sorting_Algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        //         0,  1,  2,  3,  4
        int a[] = {36, 19, 29, 12, 5};
        int temp;
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("The array after bubble sort: " + a[i]);
        }
    }
}
