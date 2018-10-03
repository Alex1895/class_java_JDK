package training;

import java.util.*;
public class primos {
	static Scanner entrada = new Scanner(System.in);
	static boolean primo(int n){
		int m = 2;
		boolean band = true;
		while ((band)&&(m<n)){
			if((n%m)==0)
				band = false;
			else 
				m = m+1;
		}
		return band;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 0, n;
		while (true){
			System.out.println("ingrese el numero");
			n = entrada.nextInt();
			if(primo(n))
				a += n;
			System.out.println(a);
		}
		//System.out.println("la sumatoria de los numeros primos es:" + a);
	}
}

