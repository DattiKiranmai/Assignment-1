package ArrayLevel5;

import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array length: ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the Array contents: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println("Array contents before sorting:   ");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("Array contents after sorting: ");
	SortIn s=new SortIn();
	int[] res=s.insertionSorting(arr);
	
	for(int a:res) {
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("Enter the key to search: ");
	int key=scan.nextInt();
   int low=0;
   int high=arr.length-1;
   while(low<=high) {
	   int mid=(low+high)/2;
	   if(key==arr[mid]) {
		   System.out.println("Key found at index "+mid);
		   return;
	   }
	   else if(key>arr[mid]) {
		   low=mid+1;
	   }
	   else {
		   high=mid-1;
	   }
   }
   System.out.println("key not found");

}

}
