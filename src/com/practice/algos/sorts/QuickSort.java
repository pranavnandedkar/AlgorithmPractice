package com.practice.algos.sorts;

import java.util.Random;

public class QuickSort {

	private static void quickSort(int low,int hi, int[] a) {
		if(low<hi){
			int p = partition(low,hi,a);
			if(low < p-1)
				quickSort(low,p-1,a);
			if(hi > p+1)
				quickSort(p+1,hi,a);
		}
	}
	private static int partition(int low, int hi, int[] a) {
		int pivot = a[hi];
		int i = low;
		for(int j = low; j<=hi;j++){
			if(a[j] < pivot){
				int temp = a[i] ;
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}

		int temp = a[i] ;
		a[i] = a[hi];
		a[hi] = temp;

		return i;
	}





	public static void main(String[] args) {
		try {

			int[] a = new int[1000];
			Random r = new Random();
			for(int i=0;i<a.length;i++){
				a[i] = r.nextInt(1000);
			}
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}		


			quickSort(0,a.length-1,a);

			System.out.println("\nAnswer:--->\n");

			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}		

		} catch (Exception e) {
			System.out.println(e);
		}
	}



}
