package com.kodnest.projectsession;

import java.util.Scanner;

public class NumberIsDivisible {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	boolean res=NumberDivisibleApp.divisibleOrNot(num);
	if(res==true) {
		System.out.println("NUmber is divisible by 4");
	}
	else {
		System.out.println("Number is not divisible by 4");
	}
}

}
