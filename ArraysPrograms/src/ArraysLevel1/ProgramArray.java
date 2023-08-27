package ArraysLevel1;

import java.util.Scanner;

public class ProgramArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the array contents");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
			PrintArray.printArray(arr);
		
	}

}
