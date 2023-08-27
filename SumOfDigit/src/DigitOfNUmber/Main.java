package DigitOfNUmber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int sum=0;
		calculateSumOfDigits(n,sum);
		
	}
	public static void calculateSumOfDigits(int n,int sum) {
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("sum of the digits of a number: "+ sum);
	}

}
