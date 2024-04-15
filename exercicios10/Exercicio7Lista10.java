package exercicios10;

public class Exercicio7Lista10 {
	public static void main(String[] args) {
		System.out.println("Potências de 3 de 0 a 15:");
		int base = 3;
		long resultado = 1;

		for (int expoente = 0; expoente <= 15; expoente++) {
			if (expoente == 0) {
				resultado = 1;
			} else if (expoente == 1) {
				resultado = base;
			} else {
				resultado *= base;
			}
			System.out.println("3^" + expoente + " = " + resultado);
		}
	}
}
