// Program to get min element of array

package com.array;

class Array1D3{
	static void min(int a[]){
		int min=a[0];
		for(int i=0; i<a.length; i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String args[]){
		int a[]={4,2,7,5,9,1};
		min(a);
	}
}