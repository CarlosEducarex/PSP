package ejercicio2;

public class SumarNumeros {

	public static void main(String[] args) {

		final int SUP = 100;
		final int INF = 0;
		int suma = 0;

		for (int i = INF; i <= SUP; i++) {
			suma += i;
		}

		System.out.printf("\nLa suma de los números del 1 al 100 es %d.", suma);
	}
}
