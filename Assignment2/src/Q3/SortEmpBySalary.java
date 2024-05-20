package Q3;

import java.util.Arrays;

import Q2.InsersionSortDescending;

public class SortEmpBySalary {
	public static void main(String[] args) {
		
		Employee earr[] = { 
				new Employee(1, "Sanky", 90000), 
				new Employee(2, "Amit", 80000),
				new Employee(3, "Abhi", 70000), 
				new Employee(4, "Suraj", 60000), 
				new Employee(5, "Rohit", 50000), 
		};
		
		InsersionSort(earr);
	}
	


	public static void InsersionSort(Employee arr[]) {
		
		for (int i = 1; i < arr.length; i++) {
			Employee temp = arr[i];
			int j = i - 1;
			
			while (j >= 0 && temp.salary < arr[j].salary) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		System.out.println("Sorted-" + Arrays.toString(arr));
		
	}
}
