package polygoneIdentifier;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		
	}
	public static void identifpolygone(int sides) {
		switch(sides) {
		case 3:
			System.out.println(" Triangle");
			break;
		case 4:
			System.out.println(" Quadrilateral");
			break;
		case 5:
			System.out.println(" pentagone");
			break;
		case 6:
			System.out.println(" Hexagone");
			break;
		case 7:
			System.out.println(" Heptagone");
			break;
		case 8:
			System.out.println("octagone");
			break;
		default:
			System.out.println(" read the message carefully");
			break;
		}
	}

}
