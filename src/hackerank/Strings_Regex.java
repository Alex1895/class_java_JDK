package hackerank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Strings_Regex {
	public static void Regex(){
		  Scanner in = new Scanner(System.in);
	        int testCases = Integer.parseInt(in.nextLine());
	        while(testCases > 0){
	            String pattern = in.nextLine();
	            try {
	                Pattern.compile(pattern);
	                System.out.println("Valid");
	            } catch (PatternSyntaxException e) {
	                System.out.println("Invalid");
	            }
	            testCases--;
	        }

	}
	public static void main(String[] args) {
		Regex();
	}
}
