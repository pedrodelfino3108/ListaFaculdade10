package exercicios10;

public class Exercicio10Lista10 {
	public static void main(String[] args) {
		int inicio = 10;
		int fim = 100;
		int passo = 10;

		System.out.println("Conversão de Celsius para Fahrenheit:");
		System.out.println("Celsius\tFahrenheit");

		for (int celsius = inicio; celsius <= fim; celsius += passo) {
			double fahrenheit = (9.0 * celsius + 160) / 5;
			System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
		}
	}
}
