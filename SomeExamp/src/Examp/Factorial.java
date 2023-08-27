package Examp;

import java.util.Scanner;

public class Factorial {
public static int calculateFactorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	return fact;
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	int res=calculateFactorial(num);
	System.out.println("Factorial: "+res);
}
}
