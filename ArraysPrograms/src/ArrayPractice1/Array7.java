package ArrayPractice1;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[sc.nextInt()];
		int count=0;
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.print(x+" ");
       }
		int store=1;
		for(int i=0;i<=arr.length-1;i++) {
			store=arr[i]*store;
		}
		System.out.println("Product of Array elements: "+store);
	}
}
