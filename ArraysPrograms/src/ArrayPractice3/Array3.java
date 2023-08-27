package ArrayPractice3;

import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the starting range: ");
	int a=scan.nextInt();
	System.out.println("Enter the upto range: ");
	int b=scan.nextInt();
	PrimeRange3 p=new PrimeRange3();
	System.out.println("Prime numbers between "+a+" and "+b+" is: ");
		int res=p.primeNumbers(a, b);
   
}
}
