package ArrayPractice1;

import java.util.Scanner;

public class Array3 {
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
		System.out.println("Enter the smaller number: ");
		int smallnumber=sc.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==smallnumber) {
				System.out.println("Key found at index "+i);
				return;
			}
		}
		System.out.println("Key not found");
}
}
