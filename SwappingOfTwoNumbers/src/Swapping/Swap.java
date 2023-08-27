package Swapping;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the elements: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int c;
		System.out.println("Before Swaping ="+" x: "+x+" y: "+y);
		c=x;
		x=y;
     	y=c;
		System.out.println("After swaping ="+" x: "+x+" y: "+y);
		
	}

}
