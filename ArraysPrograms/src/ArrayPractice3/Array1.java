package ArrayPractice3;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=scan.nextInt();
	Factorial1 f=new Factorial1();
	int res=f.factorialofANumbers(n);
	System.out.println("factorial Sum of the given numbers: "+res);
}
}
