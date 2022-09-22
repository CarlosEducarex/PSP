package ejercicio4;

public class Provincial extends Llamada {

	private int hora; // horas en punto

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public double calcularCosteTotal() {
		return 0;
	}

}
