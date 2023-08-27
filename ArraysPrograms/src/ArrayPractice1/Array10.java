package ArrayPractice1;

import java.util.Scanner;

public class Array10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[sc.nextInt()];
		int count=0;
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int x:arr) {
			System.out.print(x+" ");
         }
		System.out.println();
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate are present in a Array at index: "+j);
				}
			}
		}
}
}