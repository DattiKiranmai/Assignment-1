package ArraysLevel1;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" the contents of an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array collection: ");
		for(int i:arr) {
		System.out.print((i+5)+" ");   
			
		}
	}

}
