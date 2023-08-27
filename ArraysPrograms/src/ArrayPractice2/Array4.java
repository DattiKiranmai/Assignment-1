package ArrayPractice2;

import java.util.Scanner;

public class Array4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the integer : ");
	int num=sc.nextInt();
	SetBit4 set=new SetBit4();
	int res=set.countSetBit(num);
	System.out.println("Number of set bits: "+res);
}
}
