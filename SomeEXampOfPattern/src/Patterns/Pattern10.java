package Patterns;

public class Pattern10 {
		public static void main(String[] args) {
				for(int i=1;i<=5;i++) {
					int x=i;
					int y=5-i+1;
					for(int j=1;j<=5;j++) {
						if(j%2==0) {
						System.out.print(x+" ");
						}
						else {
							System.out.print(y+" ");
						}
						x=x+5;
						y=y+5;
					}
					System.out.println();
				}
		}
}

