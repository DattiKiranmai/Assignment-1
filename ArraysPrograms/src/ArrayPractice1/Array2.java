package ArrayPractice1;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		float arr[]=new float[sc.nextInt()];
		int count=0;
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextFloat();
		}
		float ave=0;
		for(int i=0;i<=arr.length-1;i++) {
			 ave=arr[i]+ave;
		}
		System.out.println("Averge of temparatures is:  "+(ave/arr.length));
}
}
