package ArrayPractice3;

public class PerfectNumber4 {
public int perfectNumberorNot(int a) {
	int sum=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum=sum+i;
		}
	}
	return sum;
}
}
