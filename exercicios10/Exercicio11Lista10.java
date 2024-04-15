package exercicios10;

public class Exercicio11Lista10 {
	public static void main(String[] args) {
		int inicio = 1;
		int fim = 10;

		System.out.println("Fatorial dos números ímpares de 1 a 10:");

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				int fatorial = calcularFatorial(i);
				System.out.println(i + "! = " + fatorial);
			}
		}
	}

	public static int calcularFatorial(int num) {
		int resultado = 1;
		for (int j = 2; j <= num; j++) {
			resultado *= j;
		}
		return resultado;
	}
}
