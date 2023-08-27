package ArrayPractice2;

public class Operators5 {
public int calculate(int a,int b,char choice) {
	switch(choice) {
	case '+':addition(a,b);
	         break;
	case '-':substraction(a,b);
	         break;
	case '*':multipilication(a,b);
	         break;
	case '/':division(a,b);
	         break;	
	}

	return 0;
}
public int addition(int a,int b) {
	int add=a+b;
	return add;
}
public int substraction(int a,int b) {
	int sub=a-b;
	return sub;
}
public int multipilication(int a,int b) {
	int mul=a*b;
	return mul;
}
public int division(int a,int b) {
	int div=a/b;
	return div;
}
}
