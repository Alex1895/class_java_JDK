package FundamentosJavaCore;
//import Persona.*;
public class ObjectPerson {
	public static void main(String...args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.Nombre = "Armando";
		p1.AP = "Jacobo";
		p1.AM = "Perez";
		p1.desplegarNombre();
		System.out.println();
		p2.Nombre = "Armando";
		p2.AP = "Hoyos";
		p2.AM = "Jajajaja";
		p2.desplegarNombre();
	}
}
