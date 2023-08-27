package ArrayLevel4;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Array the length: ");
	int arr[]=new int[scan.nextInt()];
	int low=0;
	int high=arr.length-1;
	System.out.println("Enter the Array contents:  ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter a search element: ");
	int key=scan.nextInt();
	Search s=new Search();
	int res=s.binarySearch(arr,low,high,key);
	if(res!=-1) {
		System.out.println("key found at index "+res);
	}
	else {
		System.out.println("key not found");
	}
}
}
