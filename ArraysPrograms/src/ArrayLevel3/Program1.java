package ArrayLevel3;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[scan.nextInt()];
		int sum=0;
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		Arraysum1 arraysum=new Arraysum1();
		int res=arraysum.findSum(arr, sum);
		System.out.print("Sum of Array elements are:  "+res);
		
	}
}
