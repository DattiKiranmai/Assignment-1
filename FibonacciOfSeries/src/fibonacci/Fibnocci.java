package fibonacci;

import java.util.Scanner;

public class Fibnocci {
	 
			public  String  fibonacciSeries(int n) {
				int fib1=0;
				int fib2=1;
				if(n==1) {
					System.out.println(fib1+" ");
					return "complete";
				}
				else if(n==2) {
					System.out.println(fib1+" "+fib2);
					return "compelete";
				}
				else {
					System.out.print(fib1+" "+fib2);
					for(int i=3;i<=n;i++) {
						int nextNo=fib1+fib2;
						System.out.print(" "+nextNo+" ");
						fib1=fib2;
						fib2=nextNo;
					}
					return "compelte";
				}
				
				
			}

		 

}
