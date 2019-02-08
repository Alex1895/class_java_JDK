package FundamentosJavaCore;

import java.util.Scanner;

public class ifelseinjava {
	final static Scanner sc = new Scanner(System.in);
	static void school() {
		System.out.println("Proporciona un valor entre 0 y 10");
		int cal = Integer.parseInt(sc.nextLine());
		//char text= ' ';
		if(cal<=9 && cal>=10) { 
		System.out.println("A");
		}
		else if(cal<=8 && cal>=9) {
			System.out.println("B");
		}
		else if(cal<=7 && cal>=8) {
			System.out.println("C");
			}
		else if(cal<=6 && cal>=7) {
			System.out.println("D");
			}
		else
			System.out.println("Valor Desconocido");
	}
	static void switchandif() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school();
	}

}
