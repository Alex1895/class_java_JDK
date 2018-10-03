package training;
import java.util.*;
public class palindromo {
	public boolean palindromo(String cadena) {
		boolean valor = true;
		int i, ind;
		String cadena2="";
		for (int x=0; x < cadena.length(); x++) {
			if (cadena.charAt(x) != ' ') {
				cadena2 += cadena.charAt(x);	
			}
			}
		cadena=cadena2;
		ind=cadena.length();
		//comparamos cadenas
		for (i= 0 ;i < (cadena.length()); i++){
			if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
			valor=false;
			break;
			}
			ind--;
			}
			return valor;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nuevo;
		palindromo objclass=new palindromo();
		System.out.println("Ingresa la palabra");
		nuevo = scanner.nextLine();
		;
		if(objclass.palindromo(nuevo)){
		System.out.println("Palindromo");
		}
		else
		{
		System.out.println("No Palindromo");
		}
	}

}
