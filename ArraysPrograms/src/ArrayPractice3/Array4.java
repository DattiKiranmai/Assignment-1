package ArrayPractice3;

import java.util.Scanner;

public class Array4 {
     public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=scan.nextInt();
		PerfectNumber4 per=new PerfectNumber4();
		int res=per.perfectNumberorNot(a);
		if(a%res==0) {
			System.out.println("The number "+a+" is perfect number ");
		}
		else {
			System.out.println("The number is not perfect");
		}
	}
}
