package Covertopic;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPractice {

	int[] arr = new int[4];
	Integer[] arr1 = { 203, 105, 103, 204, 103, 55, 105 };
	int[] arr2 = { 101, 203, 204, 44, 55, 44, 55 };

	public void arrayExample() {

		arr[0] = 103;
		arr[1] = 21;
		arr[2] = 44;
		arr[3] = 106;

		for (int i = 0; i < arr.length; i++) {

		}
	    

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		
	}

	public void duplicateArrayValues() {

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {

				if (arr2[i] == arr2[j]) {

					System.out.println("value " + arr2[i] + " is common at index " + j);
				}

			}

		}

	}

	public void commonArrayValues() {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					System.out.println("value " + arr1[i] + " is common in both the array");
				}

			}
		}
	}

	public void arrayContainsValue() {

		boolean found = false;
		for (int i = 0; i < arr2.length; i++) {

			if (arr2[i] == 44) {
				found = true;
			}
		}
		if (found) {
			System.out.println("value is present");
		}
		/*
		 * else { System.out.println("value is not present"); }
		 */

	}

	public void reverseArray() {

		int[] arrReverse = new int[arr2.length];
		int counter = 0;
		for (int i = arr2.length - 1; i >= 0; i--) {
			arrReverse[counter] = arr2[i];
			counter++;

		}
		System.out.println(Arrays.toString(arrReverse));

	}

	public void replceValue() {

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == 105) {

				arr1[i] = 10;
			}

		}
		System.out.println(Arrays.toString(arr1));

	}

	public void mergeArray() {
		int mergeArray[]= new int[arr1.length+arr2.length];
		
		for(int i=0;i<mergeArray.length;i++) {
			
			if(i<arr1.length) {
				mergeArray[i]=arr1[i];
			}
		}
		int counter =0;
		for(int i=arr1.length;i<mergeArray.length;i++) {
			
			mergeArray[i]=arr2[counter];
			counter++;
		}
		
System.out.println(Arrays.toString(mergeArray));
	}
	
public void largestValue() {
		
		int[]a= {22,32,24,32,77};
		int max = a[0];
		
		for(int i1=0;i1<a.length;i1++) {
			
			if(a[i1]>max) {
				
			max =a[i1];
			
			}
		
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		ap.arrayExample();
		ap.duplicateArrayValues();
		ap.commonArrayValues();
		ap.arrayContainsValue();
		ap.reverseArray();
		ap.replceValue();
		ap.mergeArray();
		ap.largestValue();
	}

}
