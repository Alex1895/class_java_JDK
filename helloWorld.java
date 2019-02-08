package FundamentosJavaCore;

import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el nombre de usuario por favor");
		String user = sc.nextLine();
		System.out.println("Bienvenido"+"\n"+user);
		System.out.println("Bienvenido"+"\b"+user);
		System.out.println("Bienvenido"+"\t"+user);
		System.out.println("Bienvenido"+"\r"+user);
	}

}
