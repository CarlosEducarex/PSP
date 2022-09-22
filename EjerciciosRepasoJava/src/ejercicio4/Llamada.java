package ejercicio4;

public abstract class Llamada {

	private String numOrigen;
	private String numDestino;
	protected int duracion;
	private double costeLlamada;

	public Llamada() {
	}

	public Llamada(String numOrigen, String numDestino, int duracion, double costeLlamada) {
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
		this.costeLlamada = costeLlamada;
	}

	public abstract double calcularCosteTotal();

	public String getNumOrigen() {
		return numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public double getCosteLlamada() {
		return costeLlamada;
	}

	public void setNumOrigen(String numOrigen) {
		this.numOrigen = numOrigen;
	}

	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	public void setCosteLlamada(double costeLlamada) {
		this.costeLlamada = costeLlamada;
	}

}
