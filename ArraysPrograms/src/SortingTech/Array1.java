package SortingTech;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array length: ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the Array contents: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Array contents before sorting:  ");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the user choice which technique is want: ");
	int key=scan.nextInt();
	SortingTech1 s=new SortingTech1();
	switch(key) {
	case 1:s.bubbleSorting(arr);
	       break;
	case 2:s.selectionSorting(arr);
	       break;
	case 3:s.insertionSorting(arr);
	       break;
	}
	System.out.println("Array contents After sorting:  ");
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the searching element: ");
	int target=scan.nextInt();
//	for(int i=0;i<=arr.length-1;i++) {
//		if(target==arr[i]) {
//			System.out.println("key found at index "+i);
//			return;
//		}
//	}
//	System.out.println("key not found");
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(target==arr[mid]) {
			System.out.println("key found at index "+mid);
			return;
		}
		else if(target>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	System.out.println("key not found");
}
}
