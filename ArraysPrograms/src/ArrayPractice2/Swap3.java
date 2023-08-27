package ArrayPractice2;

public class Swap3 {
void swapUsingBitwise(int a,int b) {
    a=a^b;
    b=a^b;
    a=a^b;
	System.out.println("After swapping: ");
	System.out.println("First: "+a);
	System.out.println("Second: "+b);
}
}
