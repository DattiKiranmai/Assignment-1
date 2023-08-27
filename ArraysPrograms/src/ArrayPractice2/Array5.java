package ArrayPractice2;

import java.util.Scanner;

public class Array5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a=sc.nextInt();
	System.out.println("Enter the second number: ");
	int b=sc.nextInt();
	System.out.println("Enter your choice +,-,*,/ : ");
	char choice=sc.next().charAt(0);
	Operators5 op=new Operators5();
	int res=op.calculate(a, b, choice);
	System.out.println(res);
	
}
}
