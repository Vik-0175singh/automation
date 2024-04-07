package demo;

import java.util.Arrays;
import java.util.Collections;

public class DemoArray {

	int[] a = new int[4];

	int b[] = { 3, 4, 5, 6 };

	

	public void printArray() {

		a[0] = 10;
		a[1] = 20;
		a[2] = -1;
		a[3] = 5;

		for (int i = 0; i < a.length; i++) {

		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	public static void Arrayorder() {
		Integer[] arrayEx1 = { 3, -1, -4, -5, 20, 30 };

		Arrays.sort(arrayEx1);// Ascending order

		System.out.println(Arrays.toString(arrayEx1));

		Arrays.sort(arrayEx1, Collections.reverseOrder());

		System.out.println(Arrays.toString(arrayEx1));

	}

	public static void duplicateArrayValues() {
		Integer[] arrayEx2 = { 3, -1, -1, -4, -5, 20, 30, 30, 20 };

		for (int i = 0; i < arrayEx2.length; i++) {

			for (int j = i + 1; j < arrayEx2.length; j++) {

				if (arrayEx2[i] == arrayEx2[j]) {

					System.out.println("value " + arrayEx2[i] + " is duplicate at index" + j);

				}

			}

		}

	}

	public static void commonArrayValues() {

		int c[] = { 2, 4, 6, 8, 9 };
		int d[] = { 2, 4, 5, 6, 7, 8 };

		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < d.length; j++) {

				if (c[i] == d[j]) {

					System.out.println("value " + c[i] + " is present in array d");
				}

			}

		}
	}

	public static void arrayContainsValues() {
		int e[] = { 2, 4, 6, 8, 9 };

		boolean found = false;
		for (int i = 0; i < e.length; i++) {

			if (e[i] == 2) {
				found = true;

			}
		}
		if (found) {
			System.out.println("Value 2 is present");
		} else {

			System.out.println("Value 2 is not present");
		}
	}

	public static void reverseArray() {
		int arr[] = { 2, 4, 6, 8, 9 };

		int[] arrReverse = new int[arr.length];

		int counter = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			arrReverse[counter] = arr[i];

			counter++;

		}
		System.out.println(Arrays.toString(arrReverse));
	}

	public static void replaceValue() {

		int[] x = { 2, 5, 7, 44, 66, 44, 55 };

		for (int i = 0; i < x.length; i++) {

			if (x[i] == 44) {
				x[i] = 33;

			}

		}
		System.out.println(Arrays.toString(x));
	}

	public static void mergeArrays() {
		
		int b[] = { 3, 4, 5, 6,8 };

		int c[] = { 7, 8, 9, 10 };
		
		int arr= b.length;
		int arr1= c.length;
		
		int count;
		
		int mergearray[]= new int[arr+arr1];
		
		for(int i=0;i<mergearray.length;i++) {
			
			if(i<b.length) {
				
				mergearray[i]=b[i];
			}
			
		}
		int counter =0;
		for(int i=b.length;i<mergearray.length;i++) {
			
			mergearray[i]=c[counter];
			counter++;
			
		}
		
		System.out.println(Arrays.toString(mergearray));

	}

	public static void main(String[] args) {

		DemoArray da = new DemoArray();
		da.printArray();
		da.Arrayorder();

		DemoArray.duplicateArrayValues();
		DemoArray.commonArrayValues();
		DemoArray.arrayContainsValues();
		DemoArray.reverseArray();
		DemoArray.replaceValue();
		DemoArray.mergeArrays();
	}

}
