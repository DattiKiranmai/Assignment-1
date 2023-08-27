package ArrayLevel3;

import java.util.Scanner;

public class Program4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a array length: ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter Array contents: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	ReplaceArray4 replace=new ReplaceArray4();
	replace.replaceNegativeArray(arr);
	System.out.println("Replace Array is: ");
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
