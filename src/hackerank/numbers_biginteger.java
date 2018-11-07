package hackerank;

import java.math.BigInteger;
import java.util.Scanner;

public class numbers_biginteger {
	static BigInteger a , b;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		a = new BigInteger(sc.next()); //declaration of num1 in format BigInteger
		b = new BigInteger(sc.next()); //declaration of num2 in format BigInteger
			//System.out.println(a +""+ b);
			BigInteger sum = a .add(b); //.add es para hacer la suma con BigInteger de la variable a + b
			System.out.println(sum);
			BigInteger mult = a .multiply(b);//.multiply es para hacer la multiplicacion con BigInteger de la variable a * b
			System.out.println(mult);
		
	}
}
