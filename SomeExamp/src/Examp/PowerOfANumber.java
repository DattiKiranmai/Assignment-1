package Examp;

import java.util.Scanner;

public class PowerOfANumber {
public static long findPower(int base,int exponent) {
	int sum=1;
	int i=1;
	while(i<=exponent) {
		sum=sum*base;
		i++;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int base=scanner.nextInt();
	int exponent=scanner.nextInt();
	long res=findPower(base,exponent);
	System.out.println(res);
	
}
}
