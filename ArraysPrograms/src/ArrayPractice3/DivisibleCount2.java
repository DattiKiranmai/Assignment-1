package ArrayPractice3;

public class DivisibleCount2 {
public int calculateTheCount(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
	}
	return count;
}
}
