package Q2;

import java.util.Arrays;

public class InsersionSortDescending {
	public static void main(String[] args) {
		int arr[] = { 11, 55, 88, 99, 77, 25, 456 };
		InsersionSort(arr, arr.length);

	}

	public static void InsersionSort(int arr[], int n) {
		
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp > arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}

		
//		for (int i = n-2; i >=0 ; i--) {
//			int temp = arr[i];
//			int j = i + 1;
//			while (j <= n-1 && temp < arr[j]) {
//				arr[j - 1] = arr[j];
//				j++;
//			}
//			arr[j - 1] = temp;
//		}
		System.out.println("Sorted-" + Arrays.toString(arr));

	}
}
