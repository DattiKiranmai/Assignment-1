package LCMOfTwoNums;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers to the lcm: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int res=lcmOfTwoNums(num1,num2);
	System.out.println("LCM of "+num1+" and "+num2+" is:  "+res);
	
}
public static int gcdOFTwoNums(int num1,int num2) {
	while(num2!=0) {
		int rem=num1%num2;
		num1=num2;
		num2=rem;
	}
	return num1;
}
public static int lcmOfTwoNums(int num1,int num2) {
	int gcd=gcdOFTwoNums(num1,num2);
	int lcm=(num1*num2)/gcd;
	return lcm;
}
}
