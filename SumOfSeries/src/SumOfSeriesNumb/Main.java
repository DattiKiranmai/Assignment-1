package SumOfSeriesNumb;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter n value");
		int n=scan.nextInt();
		calculateSumOfSeries(n);
	}
	public static void calculateSumOfSeries(int n) {
		double a=0,i;
		for( i=1;i<=n;i++){
			a=a+1/i;
			
		}
		System.out.println("sum of the series: "+a);
		
	}

}
