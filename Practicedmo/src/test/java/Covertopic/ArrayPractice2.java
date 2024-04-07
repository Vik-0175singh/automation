package Covertopic;

import java.util.Arrays;

public class ArrayPractice2 {

	public void multidimensionalArray() {

		int[][] multidimensionalArr = { { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < multidimensionalArr.length; i++) {

			for (int j = 0; j < multidimensionalArr[i].length; j++) {

				System.out.print(multidimensionalArr[i][j]);
			}

		}

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
	
	public void smallValue() {
		
		int[]a1= {22,32,24,35,77};
		int min = a1[0];
		
		for(int i1=0;i1<a1.length;i1++) {
			
		/*	if(a1[i1]<min) {
				
			min =a1[i1];
			
			}*/
			
			min = Math.min(min, a1[i1]);
		
		}
		System.out.println(min);
	}
	
	public void averageValue() {
		int[]c= {22,32,24,35,77};
		int length = c.length;
		int sum =0;
		
		for(int i=0;i<c.length;i++) {
			
			sum +=c[i];
		}
		double average = sum/length;
		
		System.out.println("average of an array "+average);
		System.out.println(sum);
		System.out.println(length);
		
	}

	public static void main(String[] args) {
		ArrayPractice2 ap1 = new ArrayPractice2();
		ap1.multidimensionalArray();
		ap1.largestValue();
		ap1.smallValue();
		ap1.averageValue();

	}

}
