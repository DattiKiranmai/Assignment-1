package Characteridentifier;

import java.util.Scanner;

public class Type2 {
	public static void main(String args[]) {
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter the character");
		   char ch=scan.next().charAt(0);
		   identifyCharacter(ch);
		
	   }
	   
	   public static void identifyCharacter(char ch) {
		     
		     
		   if(Character.isDigit(ch)) {
			   System.out.println("The character "+ch+" is digit");
		        }
		     else if(!Character.isLetter(ch)) {
		    	 System.out.println("The character "+ch+" is a special character");
		     }
		     
		     else{
		    	 
		    	 switch(Character.toLowerCase(ch)) {
		    	 case 'a':
		    	 case 'e':
		    	 case 'i':
		    	 case 'o':
		    	 case 'u':
		    		 if(Character.isLowerCase(ch)) {
		    			  System.out.println("the character "+ch+" is a lower-case vowel");
		    		 }
		    		 else {
		    			 System.out.println("the character "+ch+" is a Upper-case vowel");
		    		 }
		    		 break;
		    		 default:
		    			if(Character.isLowerCase(ch)) {
		    				 System.out.println("the character "+ch+" is a lower-case consonent");
		    			}
		    			else {
		    				 System.out.println("the character "+ch+" is a upper-case consonent");
		    			}
		    			break;
		    		 
		    	 }
		   
		          }
		   }
}
