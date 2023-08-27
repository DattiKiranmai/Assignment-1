package ArraysLevel1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the Array contents: ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search: ");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("Key found");
				//return;
				System.exit(0);
			}
		
		}
		System.out.println("Key Not Found");
	}

}
