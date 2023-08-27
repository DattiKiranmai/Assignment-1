package ArmstrongOrNot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int original=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		System.out.println(n);
		System.out.println(count);
		Armstrong arm=new Armstrong();
		int res=arm.armstrongOfANumber(original,count);
		System.out.println("sum of a given number is: "+res);
		if(original==res) {
			System.out.println("The number "+original+" is Armstrong");
		}
		else {
			System.out.println("The number "+original+" is not Armstrong");
		}
	}

}
