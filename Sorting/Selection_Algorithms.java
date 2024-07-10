package Sorting;

public class Selection_Algorithms {
	public static void main(String[] args) {
		// 0, 1, 2, 3, 4, 5, 6
		int[] a = { 38, 52, 9, 18, 6, 62, 13 };
		int temp = 0;
		int min = 0;
		int j;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + " ");
		}
	}
}
