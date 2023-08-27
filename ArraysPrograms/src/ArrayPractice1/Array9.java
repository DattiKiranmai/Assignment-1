package ArrayPractice1;

import java.util.Scanner;

public class Array9 {
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
		
	   for(int i=0;i<=arr.length-1;i++) {
		   int fact=1;
				for(int j=1;j<=arr[i];j++) {
					fact=fact*j;
				}
				System.out.println("Factroial of "+arr[i]+" is: "+fact);
			}
		}
}
