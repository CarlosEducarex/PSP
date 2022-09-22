package ejercicio3;

public class Main {

	public static void main(String[] args) {

		Asignatura a1 = new Asignatura(1);
		Asignatura a2 = new Asignatura(2);
		Asignatura a3 = new Asignatura(3);

		Alumno alumno1 = new Alumno(a1, a2, a3);
		
		Profesor p1 = new Profesor();
		
		p1.ponerNotas(alumno1);
		
		System.out.printf("\nLa media del alumno 1 es %.2f", p1.calcularMedia(alumno1));
	}
}
