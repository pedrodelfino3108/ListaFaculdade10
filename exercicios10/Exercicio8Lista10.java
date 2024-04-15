package exercicios10;

import java.util.Scanner;

public class Exercicio8Lista10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor da base (B): ");
		double base = scanner.nextDouble();

		System.out.println("Digite o valor do expoente (E): ");
		int expoente = scanner.nextInt();

		double resultado = calcularPotenciaRapida(base, expoente);

		System.out.printf("%.2f elevado a %d é %.2f%n", base, expoente, resultado);

		scanner.close();
	}

	public static double calcularPotenciaRapida(double base, int expoente) {
		double resultado = 1;
		double contribuicao_atual = base;
		int poder_atual = expoente;

		if (expoente < 0) {
			contribuicao_atual = 1 / base;
			poder_atual = -expoente;
		}

		while (poder_atual > 0) {
			if (poder_atual % 2 == 1) {
				resultado *= contribuicao_atual;
			}
			contribuicao_atual *= contribuicao_atual;
			poder_atual /= 2;
		}

		return resultado;
	}
}
