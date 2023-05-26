package trabalho.linguagemdeprogramacao.ex1;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite o estoque mínimo: ");
	    int minima = scanner.nextInt();

	    System.out.print("Digite  o estoque máximo: ");
	    int maxima = scanner.nextInt();

	    double estoqueMedio = (minima + maxima) / 2.0;

	    System.out.println("O estoque médio é: " + estoqueMedio);

	}

}
