package FundamentosJavaCore;

import java.util.Scanner;

/**
 * @author Alejandro Alaniz
 *
 */
public class RunCuboRubik {
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	a = 3;
	int	b = 2;
	int	c = 6;
		CuboRubik cb = new CuboRubik();
		cb.calcularVolume(a, b, c);
		CuboRubik cb1 = new CuboRubik();
		cb1.calcularVolume(a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt());
	}

}
