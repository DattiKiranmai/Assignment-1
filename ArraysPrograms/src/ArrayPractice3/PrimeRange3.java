package ArrayPractice3;

public class PrimeRange3 {
public int primeNumbers(int a,int b) {
	for(int i=a;i<=b;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(i);
		}
	}
	return 0;
  
	
}
}
