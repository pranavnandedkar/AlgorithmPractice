package com.practice.algos.sorts;

import java.util.Random;

public class SelectionSort {
	private static void  selection(int i, int j, int[] a) {
		for(int c=0;c<a.length;c++){
			int smallest = 99999999;
			int smallestSr = c;
			for(int d=c; d<a.length; d++){
				if(a[d] < smallest){
					smallest = a[d];
					smallestSr = d;
				}
			}
			int temp = a[c];
			a[c] = a[smallestSr];
			a[smallestSr] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		try {

			
			int[] a = new int[10];
			Random r = new Random();
			for(int i=0;i<a.length;i++){
				a[i] = r.nextInt(100);
			}
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}		


			selection(0,a.length-1,a);

			System.out.println("\nAnswer:--->\n");

			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}		

		} catch (Exception e) {
			System.out.println(e);
		}
	}



}
