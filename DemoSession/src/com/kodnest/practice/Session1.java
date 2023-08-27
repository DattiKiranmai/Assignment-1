package com.kodnest.practice;

import java.util.Scanner;

public class Session1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	byte b=sc.nextByte();
	short s=sc.nextShort();
	int  addition=b+s;
	System.out.println("addition: "+addition);
	long l=sc.nextLong();
	int i=sc.nextInt();
	long substraction=l-i;
	System.out.println("substraction: "+substraction);
	float f=sc.nextFloat();
	float remainder=f%b;
	System.out.println("remainder: "+remainder);
	double d=sc.nextDouble();
	double quotient=d/i;
	System.out.println("Quotient: "+quotient);
	int a=(int)l;  //explicit type casting
	System.out.println(a);
	int k=s;       //implicit type casting
	System.out.println(k);
	short S=b;           //implicit type casting
	System.out.println(S);
	b=(byte)s;     //explicit type casting
	System.out.println(b);
	f=(float)d;    //explicit type casting
	System.out.println(f);
	d=f;           //implicit type casting
	System.out.println(d);

}
}
