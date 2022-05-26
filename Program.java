package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String args[]) // static method
	{

		Integer arr1[] = { 7, 6, 4, -1, 1, 2 };
		System.out.println("Results for { 7, 6, 4, -1, 1, 2 }:");
		fourNumberSum(arr1, 16).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Results for { 1, 2, 3, 4, 5, 6, 7 }:");
		fourNumberSum(arr2, 10).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr3[] = { 5, -5, -2, 2, 3, -3 };
		System.out.println("Results for { 5, -5, -2, 2, 3, -3 }:");
		fourNumberSum(arr3, 0).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr4[] = { -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Results for { -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 }:");
		fourNumberSum(arr4, 4).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr5[] = { -1, 22, 18, 4, 7, 11, 2, -5, -3 };
		System.out.println("Results for { -1, 22, 18, 4, 7, 11, 2, -5, -3 }:");
		fourNumberSum(arr5, 30).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr6[] = { -10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5 };
		System.out.println("Results for { -10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5 }:");
		fourNumberSum(arr6, 20).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr7[] = { 1, 2, 3, 4, 5 };
		System.out.println("Results for { 1, 2, 3, 4, 5 }:");
		fourNumberSum(arr7, 100).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

		Integer arr8[] = { 1, 2, 3, 4, 5, -5, 6, -6 };
		System.out.println("Results for { 1, 2, 3, 4, 5, -5, 6, -6 }:");
		fourNumberSum(arr8, 5).stream().forEach(a -> {
			System.out.println("(" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + ")");
		});

		System.out.println("-----------------------");

	}

	public static List<Integer[]> fourNumberSum(Integer[] array, int targetSum) {

		Arrays.sort(array);

		List<Integer[]> solutions = new ArrayList<Integer[]>();
		Integer[] solution = new Integer[3];

		if (array.length < 4) {
			return solutions;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					for (int l = k + 1; l < array.length; l++) {
						if ((array[i] + array[j] + array[k] + array[l]) == targetSum) {
							solution = new Integer[] { array[i], array[j], array[k], array[l] };
							solutions.add(solution);
						}
					}
				}
			}
		}

		return solutions;
	}

}
