package ArrayPractice3;

public class Factorial1 {
public int factorialofANumbers(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		int fact=1;
		for(int j=1;j<=i;j++) {
			fact=fact*j;
		}
		 sum=sum+fact;
	}
	return sum;
}
}
