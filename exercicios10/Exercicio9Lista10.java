package exercicios10;

public class Exercicio9Lista10 {
	public static void main(String[] args) {
		int termos = 15;
		int primeiro = 1, segundo = 1, proximo;

		System.out.println("Série de Fibonacci até o 15º termo:");

		System.out.print(primeiro + ", " + segundo);

		for (int i = 3; i <= termos; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;

			if (i < termos) {
				System.out.print(", " + proximo);
			} else {
				System.out.print(", " + proximo + "\n");
			}
		}
	}
}
