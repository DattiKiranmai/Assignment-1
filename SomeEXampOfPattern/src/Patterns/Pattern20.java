package Patterns;

public class Pattern20 {
		public static void main(String[] args) {
			int a=1;
			for(int i=1;i<=5;i++) { 
				for(int j=4;j>=i;j--) {
				  System.out.print(" ");
				}
				for(int k=0;k<a;k++) {
					System.out.print((i)+" ");
				}
				a+=2;
				System.out.println();
			}
	}
}

