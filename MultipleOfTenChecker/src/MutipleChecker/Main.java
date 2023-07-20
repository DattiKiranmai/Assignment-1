package MutipleChecker;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n and m value");
		int n=scan.nextInt();
		int m=scan.nextInt();
		checkMultipleOfTen(n,m);
	}
	public static void checkMultipleOfTen(int n,int m) {
		/*
		if(n%m==0) {
			System.out.println("The number "+n+" is a multiple of "+m);
		}
		else {
			System.out.println("The number "+n+" is a not  multiple of "+m);
		}*/
		System.out.println(n%m==0?n+" is multible of "+m:n+" is not multible of "+m);
	}

}
