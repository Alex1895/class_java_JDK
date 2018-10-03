package training;

import java.util.*;
import java.math.*;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, n, m ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor del fibonachi");
		n = sc.nextInt();
		System.out.print(a);
		System.out.print(b);
		while(b <= n){
			b = a + b;
			a = b;
			System.out.println(a);
			System.out.println(b);
		}
	}

}
