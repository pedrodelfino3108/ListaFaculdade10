package exercicios10;

public class Exercicio6Lista10 {
	public static void main(String[] args) {
		System.out.println("Números divisíveis por 4 e menores que 200:");
		int i = 1;
		while (i < 200) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
