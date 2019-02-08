package FundamentosJavaCore;
import java.util.Scanner;
//@author Alejandro Alaniz 
//@Date 01/21/19
public class typeOfData 
{
	public static void typeOfDataPrimitiveInteger()
	{
		//Byte
		System.out.println("Byte");
		System.out.println(Byte.SIZE);
		System.out.println(Byte.BYTES);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//short 
		System.out.println("Short");
		System.out.println(Short.SIZE);
		System.out.println(Short.BYTES);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//int
		System.out.println("Int");
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//long
		System.out.println("Long");
		System.out.println(Long.SIZE);
		System.out.println(Long.BYTES);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
	}
	public static void typeOfDataPrimitiveFloat() 
	{
		//short 
		System.out.println("Float");
		System.out.println(Float.SIZE);
		System.out.println(Float.BYTES);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		//Double
		System.out.println("Double");
		System.out.println(Double.SIZE);
		System.out.println(Double.BYTES);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
	public static void typeOfDataPrimitiveStrings()
	{
		//Character 
		System.out.println("Char");
		System.out.println(Character.SIZE);
		System.out.println(Character.BYTES);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);

	}
	public static void typeOfDataPrimitiveBoolean()
	{
		//Boolean
		System.out.println("Boolean");
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		Scanner sc= new Scanner(System.in);
		System.out.println("ingrese su edad");
		int edad=sc.nextInt();
		if(edad>=18) {
			System.out.println("Eres Mayor de Edad");
		}else {
			System.out.println("Eres Menor de Edad");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la opcion deseada (1)para los tipos Enteros"
				+"\n"+"(2) para los tipos flotantes"+"(3) para los tipos Char"
				+"\n"+"(4) para los tipos Boolean");
		int res= sc.nextInt();
		if(res == 1) 
		{
			typeOfDataPrimitiveInteger();
		}else if(res==2)
		{
			typeOfDataPrimitiveFloat();
		}else if(res==3)
		{
			typeOfDataPrimitiveStrings();
		}
		else if(res==4)
		{
			typeOfDataPrimitiveBoolean();
		}
		else
		{
			System.exit(0);
		}
	}
}