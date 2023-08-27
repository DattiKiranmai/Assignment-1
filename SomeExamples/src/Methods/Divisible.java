package Methods;

public class Divisible {
	
	
	public void divisibleby2(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(" Numbers Divisible by 2:  "+i);
			}
		}
	}
	public void divisibleby3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println(" Numbers Divisible by 3:  "+i);
			}
		}
	}
	
	public void divisibleby5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.println(" Numbers Divisible by 5:  "+i);
			}
		}
	}
	public void divisible(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%5==0) {
				System.out.println(" Numbers Divisible by 2 and 5:  "+i);
			}
		}
	}
	public void divisibleNum(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0  && i%5==0) {
				System.out.println(" Numbers Divisible by 3 and 5:  "+i);
			}
		}
	}
	public void divisiblenum1(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				if(i%2==0) {
				System.out.println(" Numbers Divisible by 2:  "+i);
				}
			}
		}
	}
	public void divisiblenum2(int n) {
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
				if(i%2!=0) {
				System.out.println(" Numbers Divisible by 2:  "+i);
				}
			}
		}
	}
	
	public void allPrime(int n) {
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
			if(i%j==0 ) {
				count++;
				//System.out.println(i);
				}
			
			}
			
			if(count==2) {
				System.out.println(" print all prime numbers: "+i);
			}
			
			
		}
		
	}
	




}
