package Sorting_Algorithms;

public class QuickSort {
    public static void main(String[] args) {
        //         0,  1, 2, 3,  4,  5,  6, 7,  8
        //we have assumed 12(middle) as a pivot
        int[] a = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = a.length;
        QuickSort qsr = new QuickSort();
        qsr.QuickSortRecursion(a, 0, length - 1);
        qsr.printArray(a);
    }

    int partition(int[] a, int low, int high) {
        int pivot = a[(low + high) / 2];
        while (low <= high)
        {
            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void QuickSortRecursion(int a[], int low, int high) {
        int pi = partition(a, low, high);
        if (low < pi - 1) {
            QuickSortRecursion(a, low, pi - 1);
        }
        if (pi < high) {
            QuickSortRecursion(a, pi, high);
        }
    }

    void printArray(int[] a) {
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
