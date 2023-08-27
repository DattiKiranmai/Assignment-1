package Characteridentifier;
import java.util.*;
public class Main {
   public static void main(String args[]) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the character");
	   char ch=scan.next().charAt(0);
	   identifyCharacter(ch);
	
   }
   
   public static void identifyCharacter(char ch) {
	     
	     
	     if(Character.isLowerCase(ch)) {
		        if(ch=='a' ||ch=='e'|| ch=='i' || ch=='o'|| ch=='u') {
			   System.out.println("the character "+ch+" is a lower-case vowel");
		       }
		        else {
			   System.out.println("the character "+ch+" is lower-case consonant");
		       }
	     }
	     else if(Character.isUpperCase(ch)) {
	    	     if(ch=='A' ||ch=='E'|| ch=='I' || ch=='O'|| ch=='U') {
				   System.out.println("the character "+ch+" is a Upper-case vowel");
			       }
			      else {
				   System.out.println("the character "+ch+" is Upper-case consonant");
			       }
	     }
	     else if(Character.isDigit(ch)) {
			   System.out.println("The character "+ch+" is digit");
		        }
		     
	     else{
	    	   System.out.println("The character "+ch+" is a special character");
	          }
	   }
	   }
	   
	   
   

