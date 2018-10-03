package training;
import java.util.*;
/**
 * @author alejandro
 *
 */
public interface interfacea {
	final int a = 10;
	void display();
	class test1 implements interfacea{ // test1 esta heredando los datos de de la interface test
		public void display() {
			System.out.println("HI");
		}
	}
	public static void main (String ... args) {
		test1  t = new test1(); //declarando un objeto para que pueda utilizar el metodo 
		t.display(); //ejecucion del metodo de la clase test1
		System.out.println(a); //mandas llamara la variable constante a 
	}
}
