package ArrayPractice2;
import java.util.*;
public class Array1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values to calculate the total cost: ");
	System.out.print("Enter the purchase Amount:  ");
	double purchaseAmount=scan.nextDouble();
	System.out.println();
	System.out.print("Enter the tax Rate: ");
	double taxRate=scan.nextDouble();
	Tax1 tax=new Tax1();
	double res=tax.calculateTotalWithTax(purchaseAmount,taxRate);
	System.out.println();
	System.out.println("total cost including  tax is: "+res);
}
}
