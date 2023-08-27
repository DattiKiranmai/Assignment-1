package FindTheGcd;
import java.util.*;
public class GcdOfTwoNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter m and N value");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=gcd(m,n);
		System.out.println("gcd of "+m+" and "+n+" is "+res);
		
		
	}
	public static int gcd(int m,int n ) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
	    int Gcd=m;
		return Gcd;
	}

}
