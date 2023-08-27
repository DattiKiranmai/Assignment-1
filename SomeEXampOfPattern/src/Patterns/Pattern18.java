package Patterns;

public class Pattern18 {
		public static void main(String[] args) {
			for(int i=1;i<=5;i++) {
				int x=5-i; 
				for(int j=1;j<=5;j++) {
						System.out.print((char)(x+65)+" ");
						x=x+5;
				}
				System.out.println();
			}
	}
}

