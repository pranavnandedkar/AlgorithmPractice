package com.practice.algos;

import java.util.Random;

public class MergeSort {
	private static void mergeSort(int i, int j, int[] a) {
		int mid = (i+j)/2;
		if(i!=mid)
			mergeSort(i, mid, a);
		if(mid+1 != j)
			mergeSort(mid+1, j, a);
		merge(i,mid,j,a);
	}


	private static void merge(int i, int mid, int j, int[] a) {
		int n1 = mid-i + 1;
		int n2 = j-mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		L[n1] = 999999999;
		R[n2] = 999999999;
		for(int p=0; p<n1; p++){
			L[p] = a[i+p];
		}
		for(int p=0; p<n2; p++){
			R[p] = a[mid+1+p];
		}
		int k=0;
		int p=0;
		for(int z=i; z<=j;z++){
			if(L[k] < R[p]){
				a[z]=L[k];
				k++;
			}else{
				a[z] = R[p];
				p++;
			}
		}
	}


	public static void main(String[] args) {

		int[] a = new int[10];
		Random r = new Random();
		for(int i=0;i<a.length;i++){
			a[i] = r.nextInt(1000);
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}		
		mergeSort(0,a.length-1,a);
		System.out.println("\nAnswer:--->\n");

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}		


	}


}
