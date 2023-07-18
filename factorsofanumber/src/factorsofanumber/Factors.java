package factorsofanumber;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the N");
		int N=scan.nextInt(	);
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				System.out.println("factors of "+N+"  is  "+ i);
			}
			
		}
	}

}
