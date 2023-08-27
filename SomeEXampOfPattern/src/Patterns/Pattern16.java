package Patterns;

public class Pattern16 {
		public static void main(String[] args) {
			for(int i=0;i<5;i++) {
				int x=i;
				for(int j=1;j<=5;j++) {
					x=x+5;
						System.out.print((char)(x-5+65)+" ");
				}
				System.out.println();
			}
	}
}


