package RandomClass;
import java.util.Random;
import java.util.Scanner;

public class RandomClassExamp1 extends Random{
	public static void main(String[] args) {
		RandomClassExamp1 rand=new RandomClassExamp1();
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		System.out.println("Next value return =  "+rand.next(0x101));
		System.out.println("Next value return boolean =  "+rand.nextBoolean());
		System.out.println("Next return value int  ="+rand.nextInt());
		System.out.println("Next return value float ="+rand.nextFloat());
		System.out.println("Next return value double ="+rand.nextDouble());
		System.out.println("Next return value long ="+rand.nextLong());
		
	}

}
