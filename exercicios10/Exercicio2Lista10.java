package exercicios10;

import java.util.Scanner;

public class Exercicio2Lista10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para ver sua tabuada: ");
		int numero = scanner.nextInt();

		System.out.println("Tabuada de multiplicar do número " + numero + ":");

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		scanner.close();
	}
}
