package demo;

import java.util.Arrays;
import java.util.Collections;

public class DemoArray2 {

	int[] a = new int[5];

	public void ArrayDemo() {

		a[0] = 10;
		a[1] = 20;
		a[2] = 55;
		a[3] = 78;
		System.out.println(Arrays.toString(a));

	}

	public static void Sortarray() {

		Integer arr[] = { 1, 2, 4, 6, 2, -1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));// ascending

		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr)); // descending order
	}

	public static void duplicateArrayValues() {
		int[] s = { 1, 1, 2, 4, 5, 5, 6, 7, 7, };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {

				if (s[i] == s[j]) {

					System.out.println("value" + s[i] + "duplicate in array");
				}

			}

		}

	}

	private static void commonArrayValues() {

		int[] duplicateArray = { 20, 30, 50, 20, 100, 50 };

		int[] duplicateArray2 = { 10, 30, 50, 80, 90, 70 };

		for (int i = 0; i < duplicateArray.length; i++) {
			for (int j = 0; j < duplicateArray2.length; j++) {

				if (duplicateArray[i] == duplicateArray2[j]) {

					System.out.println("Value " + duplicateArray[i] + "is common in both the arrays");
				}
			}
		}
	}

	public static void arrayContainsValues() {

		int[] duplicateArray = { 20, 30, 50, 20, 100, 50 };

		boolean found = false;
		for (int i = 0; i < duplicateArray.length; i++) {

			if (duplicateArray[i] == 20) {
				found = true;

			}

		}
		if (found) {

			System.out.println("given value is present");
		} else {
			System.out.println("value is not present");
		}

	}

	public static void replaceValue() {
		int[] duplicateArray4 = { 20, 30, 50, 20, 100, 50 };

		for (int i = 0; i < duplicateArray4.length; i++) {

			if (duplicateArray4[i] == 20) {

				duplicateArray4[i] = 40;// replace
				System.out.println(Arrays.toString(duplicateArray4));
			}

		}

	}

	public static void reverseArray() {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		int[] reverseArray = new int[arr.length];
		int counter = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			reverseArray[counter] = arr[i];
			counter++;

		}
		System.out.println(Arrays.toString(reverseArray));
	}

	public static void mergeArrays() {

		int[] arr3 = { 3, 5, 4, 6, 22, 7 };
		int[] arr4 = { 5, 4, 3, 58, 44, 65, 34 };

		int mergedArray[] = new int[arr3.length + arr4.length];
		for (int i = 0; i < mergedArray.length; i++) {

			if (i < arr3.length) {
				mergedArray[i] = arr3[i];

			}

		}

		int counter = 0;
		for (int i = arr3.length; i <mergedArray.length; i++) {

			mergedArray[i] = arr4[counter];
			counter++;
		}
		System.out.println(Arrays.toString(mergedArray));

	}

	public static void main(String[] args) {
		DemoArray2 DA = new DemoArray2();
		DA.ArrayDemo();

		DemoArray2.Sortarray();
		DemoArray2.duplicateArrayValues();
		DemoArray2.commonArrayValues();
		DemoArray2.replaceValue();
		DemoArray2.reverseArray();
		DemoArray2.arrayContainsValues();
		DemoArray2.mergeArrays();
	}

}
