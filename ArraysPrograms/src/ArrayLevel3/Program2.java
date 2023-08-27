package ArrayLevel3;

import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array lenghts: ");
	int arr1[]=new int[scan.nextInt()];
	int arr2[]=new int[scan.nextInt()];
	System.out.println("Enter the array1 contents: ");
	for(int i=0;i<=arr1.length-1;i++) {
		arr1[i]=scan.nextInt();
	}
	System.out.println("Enter the array2 contents: ");
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=scan.nextInt();
	}
	System.out.println("array1 contents Are: ");
	for(int i=0;i<=arr1.length-1;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	System.out.println("array2 contents Are: ");
	for(int i=0;i<=arr2.length-1;i++) {
		System.out.print(arr2[i]+" ");
	}
	Merge2 merge=new Merge2();
	int res[]=merge.mergeArray(arr1,arr2);
	System.out.println();
	System.out.println("array3 contents Are: ");
	for(int x:res) {
		System.out.print(x+" ");
	}
}
}
