package FundamentosJavaCore;

import java.util.Scanner;

public class convertionOfTypeData {
	final static Scanner sc = new Scanner(System.in);
	static void numbers() {
		int a= 2;
		int b= 3;
		int res = - 3 + 6 / ++a * 4 - b-- +b;
		System.out.println(res);
	 	//System.out.println(num1 > num2 ? num1 : num2);
		
	}
	public static void Convertions()
	{
		//Scanner sc= new Scanner (System.in);
		System.out.println("Ingresa un numero");
		int x= Integer.parseInt(sc.nextLine());
		double radio = Double.parseDouble(sc.nextLine());
		char cha="asdasd".charAt(4);
		//System.out.println(x+"\n"+radio+"\n"+cha);
		System.out.println(x);
		System.out.println(radio);
		System.out.println(cha);
	}
	static void store_books()
	{
		//Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
		 int id= Integer.parseInt(sc.nextLine());
		 double precio = Double.parseDouble(sc.nextLine());
		 char simbolo = sc.nextLine().charAt(0);
		 boolean envioGratuito = Boolean.parseBoolean(sc.nextLine());
		 System.out.println(name +"#"+ id);
		 System.out.println("Precio: "+simbolo +precio);
		 System.out.println("Envio Gratuito: "+ envioGratuito);
		
	}
	static void Rectangulo()
	{
		//Scanner sc = new Scanner(System.in); 
		int ancho, alto, area, perimetro;
		ancho = Integer.parseInt(sc.nextLine());
		alto = Integer.parseInt(sc.nextLine());
		area = ancho + alto;
		perimetro = (ancho + alto) * 2;
		System.out.println("Area: " + area);
		System.out.println("Perimetro: "+ perimetro);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers();
	}
}