package ArraysLevel1;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are: ");
		for(int a:arr) {
			if(a>0) {
				System.out.println(a+" ");
			}
		}
	}

}
