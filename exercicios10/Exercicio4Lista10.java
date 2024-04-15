package exercicios10;

public class Exercicio4Lista10 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }
        System.out.println("A soma dos números pares de 1 a 500 é: " + soma);
    }
}
