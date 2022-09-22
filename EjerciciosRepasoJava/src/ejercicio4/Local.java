package ejercicio4;

public class Local extends Llamada {

	private static final double PRECIO = 0.15;

	public double calcularCosteTotal() {
		return PRECIO * duracion;
	}

}
