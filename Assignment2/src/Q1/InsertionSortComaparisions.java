package Q1;

import java.util.Arrays;

public class InsertionSortComaparisions {
	public static void main(String[] args) {
		int arr[] = { 55,44,22,66,11,33 };
		int comparision = InsersionSort(arr, arr.length);
		System.out.println("The Comparisions -"+ comparision);
	}

	public static int InsersionSort(int arr[], int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			
			
			while (j >= 0) {
				count++;
				if( temp < arr[j]) {
					arr[j + 1] = arr[j];
					
				}else {
					break;
				}
				j--;
			}
			
			arr[j + 1] = temp;
		}
//		System.out.println(count1);
		System.out.println("Sorted-" + Arrays.toString(arr));
		return count;
	}
}


