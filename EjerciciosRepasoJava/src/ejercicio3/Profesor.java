package ejercicio3;

public class Profesor {

	public static void ponerNotas(Alumno a1) {

		a1.getAsig1().setCalif(Math.random() * 10 + 1);
		a1.getAsig2().setCalif(Math.random() * 10 + 1);
		a1.getAsig3().setCalif(Math.random() * 10 + 1);
	}

	public static double calcularMedia(Alumno a1) {
   
		double media = (a1.getAsig1().getCalif() + a1.getAsig2().getCalif() + a1.getAsig3().getCalif()) / 3;

		return media;
	}
}
