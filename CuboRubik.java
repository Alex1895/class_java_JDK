package FundamentosJavaCore;
/**
 * @author Alejandro Alaniz
 *
 */
public class CuboRubik {
	int ancho,alto,profundo;

	public CuboRubik(int ancho, int alto, int profundo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	public CuboRubik() {
		
	}
	int calcularVolume(int ancho, int alto, int profundo) {
		int resultado = ancho*alto*profundo;
		System.out.println(resultado);
		return resultado;
	}
}
