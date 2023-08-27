package Patterns;

public class Pattern23 {
		public static void main(String[] args) {
			int a=0;
			for(int i=1;i<=5;i++) { 
				for(int j=5;j>=i;j--) {
				  System.out.print(" ");
				}
				for(int k=0;k<=a;k++) {
					System.out.print((char)(k+65));
				}
				a+=2;
				
				System.out.println();
			}
	}
}

