package fibonacci;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
		Fibnocci fb=new Fibnocci();
		fb.fibonacciSeries(n);
		
	}
}


