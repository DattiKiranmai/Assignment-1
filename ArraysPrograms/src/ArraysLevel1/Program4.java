package ArraysLevel1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int arr[]=new int[scan.nextInt()];
		int c;
		System.out.println("Enter the array contents");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before Swapping: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter any two index value: ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		c=arr[x];
		arr[x]=arr[y];
		arr[y]=c;
		System.out.println("After Swapping: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
