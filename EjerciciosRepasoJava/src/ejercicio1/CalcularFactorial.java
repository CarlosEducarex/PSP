package ejercicio1;

import java.util.Scanner;

public class CalcularFactorial {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int fact = 1;

		System.out.print("\nIntroduce un número entero: ");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = num; i > 0; i--) {
			fact *= i;
		}

		System.out.printf("\n\nEl factorial de %d es %d.", num, fact);
	}

}
