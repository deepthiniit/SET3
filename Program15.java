package com.niit;

import java.util.Scanner;

public class Program15 {
	public static String revandparse(String s1){
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<(2*s1.length())-1;i++)
			if(i%2!=0)
				sb1=sb.insert(i, '-');
		return sb1.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String:");
		String s1=s.next();
		System.out.println("the formatted string is:"+revandparse(s1));
	}

}
