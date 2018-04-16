package com.niit;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program14 {
	public static String lengthStr(String s1){
		int maxlen=0;
		String s2=null;
		StringTokenizer t=new StringTokenizer(s1," ");
        while(t.hasMoreTokens()){
        	s1=t.nextToken();
        	int n=s1.length();
        	if(n>maxlen){
        		maxlen=n;
        		s2=s1; 	}
        	}
        return s2;
	}
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String:");
			String s1=sc.nextLine();
			System.out.println("the lengthiest string from the given output is:"+lengthStr(s1));
		
	}

}
