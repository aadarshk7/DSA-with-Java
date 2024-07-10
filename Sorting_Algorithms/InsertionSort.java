package Sorting_Algorithms;
//Time complexity
// Best case 0(n)
//worst case 0(n^2)
//average case 0(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        // yeha sabsey important vaney ko array ko vitra ko data ho jun 0 bata suru huncha
        //           0, 1, 2, 3, 4, 5
        int arr[] = {5, 1, 6, 2, 4, 3};
        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;

        }
        for (int i = 0; i < arr.length; i++) {


            System.out.println("The sorted array: " + arr[i]);
        }
    }
}
