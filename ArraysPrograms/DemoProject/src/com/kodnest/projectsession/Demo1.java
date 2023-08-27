package com.kodnest.projectsession;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	byte a=scan.nextByte();
	short b=scan.nextShort();
	int c=scan.nextInt();
	long d=scan.nextLong();
	float e=scan.nextFloat();
	double f=scan.nextDouble();
	char g=scan.next().charAt(0);
	boolean h=scan.nextBoolean();
	d=a+b;
	System.out.println(d);
	c=(int)d;
	System.out.println(c);
}
}
