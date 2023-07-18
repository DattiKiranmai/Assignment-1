package ExampArray;
import java.util.*;
public class Examp1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a=0;
		for(int i=1;i<=N;i++) {
			a=i+a;
			
		}
		System.out.println(a);	
	}

}
