package InbulidfuninStrings;

public class Main {
public static void main(String[] args) {
	String name=new String("Raja Ram Mohan Roy");
	System.out.println(name);
	System.out.println("======================================");
	System.out.println(name.toUpperCase());
	System.out.println("======================================");
	System.out.println(name.toLowerCase());
	System.out.println("======================================");
	System.out.println(name.charAt(13));
	System.out.println("======================================");
	System.out.println(name.indexOf('m'));
	System.out.println("======================================");
	System.out.println(name.contains("Ram"));
	System.out.println("======================================");
	System.out.println(name.contains("oy"));
	System.out.println("======================================");
	System.out.println(name.substring(0));
	System.out.println("======================================");
	System.out.println(name.substring(3,12));
	
}
}
