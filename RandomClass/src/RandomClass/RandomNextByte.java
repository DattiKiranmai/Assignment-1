package RandomClass;
import java.util.Random;

public class RandomNextByte {
	public static void main(String[] args) {
		Random random=new Random();
		byte[] bytes=new byte[10];
	    random.nextBytes(bytes);
	    Double val1=random.nextDouble();
	    System.out.println("return next double value = "+val1);
	    Double val2=random.nextDouble();
	    System.out.println("return next double value = "+val2);
	    float f=random.nextFloat();
	    System.out.println("return next float value = "+f);
	    System.out.println(" return all bytes values ");
	    System.out.print("(");
		for(int i=0;i<bytes.length;i++) {
			
			System.out.print(bytes[i]+" ");	
		}
		System.out.println(")");
		System.out.println("return all double values b/w 0.0 to 0.1");
for(int i=0;i<5;i++) {
			Double val3=random.nextDouble();
			System.out.print(val3+"  ");	
		}
System.out.println();
System.out.println("return all float values b/w 0.0 to 0.1");
for(int i=0;i<5;i++) {
	float f1=random.nextFloat();
	System.out.print(f1+"  ");
}
	}

}
