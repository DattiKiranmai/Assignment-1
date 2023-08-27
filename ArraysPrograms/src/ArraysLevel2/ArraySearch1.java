package ArraysLevel2;

import java.util.Scanner;

public class ArraySearch1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search: ");
		int key=scan.nextInt();
		Search1 s=new Search1();
		int res=s.linerSearch(arr,key);
		if(res>=0) {
			System.out.println("key found in index "+res);
		}
		else {
			System.out.println("key not found");
		}
	}
}
