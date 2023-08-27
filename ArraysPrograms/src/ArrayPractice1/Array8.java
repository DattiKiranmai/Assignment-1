package ArrayPractice1;

import java.util.Scanner;

public class Array8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int x:arr) {
			System.out.print(x+" ");
       }
		System.out.println();
		int cou=0;
	   for(int i=0;i<=arr.length-1;i++) {
		  int  count=0;
		   for(int j=1;j<=arr[i];j++) {
			   if(arr[i]%j==0) {
				   count++;
			   }
		   }
		   if(count==2) {
				 cou++;
			 }
		   
	   }
	  System.out.println("Count a prime in array: "+cou);
		
	}
}
