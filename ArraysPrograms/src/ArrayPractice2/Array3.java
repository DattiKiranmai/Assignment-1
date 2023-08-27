package ArrayPractice2;

import java.util.Scanner;

public class Array3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first integer: ");
	int a=sc.nextInt();
	System.out.println("Enter the second integer: ");
	int b=sc.nextInt();
	System.out.println("Before swapping: "+a+" "+b);
	Swap3 s=new Swap3();
	s.swapUsingBitwise(a, b);
	
}
}
