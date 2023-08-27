package ArrayLevel5;

import java.util.Scanner;

public class SelectionSorting {
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
		Sorting sort=new Sorting();
		int[] res=sort.selectionSorting(arr);
		System.out.println();
		System.out.println("Array contents before sorting........");
		for(int x:res) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter the key to search: ");
		int key=sc.nextInt();
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
