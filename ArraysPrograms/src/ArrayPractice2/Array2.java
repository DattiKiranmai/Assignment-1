package ArrayPractice2;

import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("is input valid(true/false): ");
	boolean a=sc.nextBoolean();
	System.out.println("Does input meet a certain condition (true/false): ");
	boolean b=sc.nextBoolean();
	Valid2 val=new Valid2();
	boolean res=val.isValidInput(a,b);
	if(res==true) {
		System.out.println("Input is valid");
	}
	else {
		System.out.println("Input is not valid");
	}
}
}
