package ArrayLevel4;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array length: ");
	int arr[]=new int[sc.nextInt()];
	System.out.println("Enter the Array elements: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Array contents before sorting........");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	int min;
	int pos;
	int help;
	for(int i=0;i<=arr.length-2;i++) {
		min=arr[i];
		pos=i;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[j]<min) {
			min=arr[j];
			pos=j;
			}
		}
		help=arr[i];
		arr[i]=arr[pos];
		arr[pos]=help;
	}
	System.out.println("Array contents After sorting........");
	for(int x:arr) {
		System.out.print(x+" ");
     }
}
}
