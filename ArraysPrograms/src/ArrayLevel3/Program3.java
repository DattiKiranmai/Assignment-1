package ArrayLevel3;

import java.util.Scanner;

public class Program3 {
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
	Merge3 m=new Merge3();
	int res[]=m.addTheElement(arr1,arr2);
	System.out.println("Array3 contents are:  ");
	for(int x:res) {
		System.out.print(x+" ");
	}
}
}
