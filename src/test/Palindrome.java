package test;
import java.util.*;
import org.junit.*;

public class Palindrome {
	
	String original, reverse = "";
	
	
	public boolean testing() {
		String original, reverse = "";
		System.out.print("Enter a string to check if it is a palindrome");
		System.out.print("\n");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		
		if(original==null || original.length()==0){
			System.out.println("Please enter a word or number or phrase\n");
			Palindrome palin = new Palindrome();
			palin.testing();
			return false;
		}
		
		else{
		original = original.replaceAll(" ", "");
		
		
		for (int i = original.length() - 1; i >= 0; i--) {

			if (Character.isLetter(original.charAt(i)) || Character.isDigit(original.charAt(i))) {
				reverse = reverse + original.charAt(i);
				

			}

			else {
				System.out.println("Punctuation mark(s)/Special characters not allowed.");
				return false;
			}
		}
			if (original.equalsIgnoreCase(reverse)) {
				System.out.println("Entered string is a palindrome.");
				return true;
			} else {
				System.out.println("Entered string is not a palindrome.");
				return false;
			}
		
		
	}
	}
	
}
