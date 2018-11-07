package hackerank;

import java.util.Scanner;
//import java.util.regex.*;
public class Strings_Regex_Validator {
	class usernamevalidator{
	public static final String regularExpression = "^[aA-zZ])\\w{7,29}" ;
	}
	private static final Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		int n =Integer.parseInt(sc.nextLine());
		while(n -- != 0){
			String userName = sc.nextLine();
			if(userName.matches(usernamevalidator.regularExpression)){
				System.out.println("Valid");
			}else{
				System.out.println("Invalid");
			}
		}
	}
}
