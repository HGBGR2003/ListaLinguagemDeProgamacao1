package trabalho.linguagemdeprogramacao.ex2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dollar hoje: " );
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite um valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar*cotacaoDolar;
        System.out.println("O valor em reais é Igual a " +valorReal );

	}

}
