package ArrayPractice1;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.print(x+" ");
       }
		System.out.println();
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				sum=arr[i]+sum;
			}
		}
		System.out.println("Sum of all positive Transctions: "+sum);
	}
}
