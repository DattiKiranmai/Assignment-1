package ArmstrongOrNot;

public class Armstrong {
	public int armstrongOfANumber(int n,int count) {
		int a=0;
		while(n!=0) {
		int rem=n%10;
		a=a+(int)Math.pow(rem,count);
		n=n/10;
		
		}
		return a;
		
	}

}