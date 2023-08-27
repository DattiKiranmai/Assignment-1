package FindTheGcd;

import java.util.Scanner;

public class GcdofTwoNum1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter m and n value");
		int m=scan.nextInt();
		int n=scan.nextInt();
		//GCD gcd=new GCD();
		//int res=gcd.findGcd(m,n);
		 int res=GCD.findGcd(m,n);
		System.out.println("gcd of "+m+" and "+n+" is "+res);
	}

}
