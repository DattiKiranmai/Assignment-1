package ArraysLevel2;

import java.util.Scanner;

public class ArraySearch2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of an array: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the array Contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a searching element: ");
		int target=scan.nextInt();
		Search2 s=new Search2();
		boolean res=s.isPresent(arr,target);
		if(res==true) {
			System.out.println("Key found");
		}
	    else {
		System.out.println("Key not found");
		}
	}

}
