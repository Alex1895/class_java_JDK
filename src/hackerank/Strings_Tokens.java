package hackerank;

import java.util.Scanner;
import java.util.regex.*;

public class Strings_Tokens {
	public static void Strings()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("write one String: ");
		String st = sc.nextLine();
		String [] st1 = st.trim().split("[^a-zA-Z]+");
		//String [] st1 = st.trim().split("");
		if(st == null || st.equals("")||st.trim().equals("")){
			//throw new Exception();
			System.out.println("0");
		}else if(st.length() > 400000) {
			return ;
		}else{
			System.out.println(st1.length);
		}
		for (String st2: st1){
			System.out.println(st2);
		}
		sc.close();
	}
	public static void main(String[] args){
		Strings();
	}
}
