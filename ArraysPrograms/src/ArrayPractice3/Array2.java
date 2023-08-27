package ArrayPractice3;
import java.util.*;
public class Array2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a integer : ");
	int n=scan.nextInt();
	DivisibleCount2 cou=new DivisibleCount2();
	int res=cou.calculateTheCount(n);
	System.out.println("Count the is divisible : "+res);
}
}
