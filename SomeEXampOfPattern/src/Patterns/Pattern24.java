package Patterns;

public class Pattern24 {
		public static void main(String[] args) {
			for(int i=1;i<=5;i++) { 
				for(int k=1;k<=5;k++) {
					if(k>i) {
						System.out.print("*"+" ");	
					}
					else {
						System.out.print(i+" ");
					}
				}
				System.out.println();
			}
	}
}

