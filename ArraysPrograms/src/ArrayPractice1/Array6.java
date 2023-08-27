package ArrayPractice1;

import java.util.Scanner;

public class Array6 {
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
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		System.out.println("Count the odd numbers in an array: "+count);
	}
	
}
