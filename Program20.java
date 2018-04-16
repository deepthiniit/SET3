package com.niit;

import java.util.Scanner;

public class Program20 {
	public static int sumOfPrimeIndices(int[] a,int n){
		int n1=0;
		int x=0;
		for(int i=2;i<=n1;i++)
			
			for(int j=2;j<=n;)
				if(x%j==0){
					x++;
				}
			if(x==0){
				n1+=a[x];	}
		return n1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array limit:");
		int n=s.nextInt();
		System.out.println("enter the array elements:");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println(sumOfPrimeIndices(a,n));
	}
}
