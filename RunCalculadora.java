package FundamentosJavaCore;

import java.util.Scanner;

public class RunCalculadora {
	public static void main(String ... args) {
		Scanner sc = new Scanner(System.in);
		Calculadora cal = new Calculadora();
		cal.sumar(sc.nextInt(), sc.nextInt());
		//System.out.println(cal);
		cal.res(sc.nextInt(), sc.nextInt());
		//System.out.println(cal);
		cal.mult(sc.nextInt(), sc.nextInt());
		//System.out.println(cal);
		cal.div(sc.nextInt(), sc.nextInt());
		//System.out.println(cal);
	}
}