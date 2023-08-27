package ArrayLevel4;

import java.util.Scanner;
public class Sorting {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array lemgth: ");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the Array contents: ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println();
	BubbleSort sort=new BubbleSort();
	sort.bubbleSort(arr);
	System.out.println("Array contents aftor sorting.......");
	for(int x:arr) {
		System.out.print(x+" ");
	}
}
}
