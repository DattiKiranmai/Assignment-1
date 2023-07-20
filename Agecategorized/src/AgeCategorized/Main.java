package AgeCategorized;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scan.nextInt();
		categorizedAge(age);
	}
	public static void categorizedAge(int age) {
		if(age>=0 && age<=12) {
			System.out.println("child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=19 && age<=59) {
			System.out.println("adult");
		}
		else  {
			System.out.println("senior");
		}
		
		
	}

}
