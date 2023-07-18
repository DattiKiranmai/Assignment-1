package factorial;
import java.util.*;
public class Factrorial {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter N");
	int N=scan.nextInt();
	int fact=1;
	for(int i=1;i<=N;i++) {
		fact=fact*i;
	}
	System.out.println("factorial of "+ N +"  is:  "+fact);
}
}
