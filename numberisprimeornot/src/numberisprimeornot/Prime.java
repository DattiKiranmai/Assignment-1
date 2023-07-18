package numberisprimeornot;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				//System.out.println(i);
				count=count+1;
				}
		}
		if(count==2){
	       System.out.println(" the number is prime");
			}
		else {
			System.out.println("the number is  not prime");
		} 
		
	}

}
/*
 for(int i=0;i<=n;i++){
 if(n%i==0){
 System.out.println("the number is  not prime");
 return;
 }
 System.out.println(" the number is prime");
 }  
                (OR)
   
 */
 
