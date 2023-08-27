package Methods;

import java.util.Scanner;

public class DivisibleApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
		//int count=0;
		Divisible d=new Divisible();
		if(n>100) {
		d.allPrime(n);
		}
		else
		{
			System.out.println("n value must be greater than 100");
		}
	}

}
