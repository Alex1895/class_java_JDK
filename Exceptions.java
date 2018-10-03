package training;
import java.util.*;
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			a = 10/0;
			System.out.println(a);
		}catch(ArithmeticException e){
			System.out.println("Error");
		}
		finally{
			String abc= "use the exception finally";
			System.out.println(abc);
		}
		System.out.println("Try Again");
	}

}
