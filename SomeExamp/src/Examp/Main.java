package Examp;

import java.util.Scanner;

public class Main {
	public static double calculateTax(double income) {
		double tax;
		if(income<=250000) {
			tax=0;
			return tax;
		}
		else if(income>250000 && income<500000) {
			tax=(income-250000)*0.05;
			return tax;
		}
		else if(income>500000 && income<1000000) {
			tax=(income-500000)*0.2+12500;
			return tax;
		}
		else {
			tax=(income-1000000)*0.3+112500;
			return tax;
		}
	}
public static void main(String []args) {
	Scanner scanner=new Scanner(System.in);
	double income=scanner.nextDouble();
	double res=calculateTax(income);
	System.out.println((res));
}

}
