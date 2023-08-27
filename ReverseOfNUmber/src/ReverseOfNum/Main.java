package ReverseOfNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(" Enter n value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Reverse rev=new Reverse();
		int res=rev.reverseOfANumber(n);
		System.out.println("Reverse of a number: "+res);
		if(n==res) {
		System.out.println(" Enter number is "+n+" palindrome ");
		}
		else {
			System.out.println(" Enter number is "+n+" Not palindrome ");
		}
	}

}
