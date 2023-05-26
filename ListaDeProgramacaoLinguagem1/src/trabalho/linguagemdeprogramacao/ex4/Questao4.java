package trabalho.linguagemdeprogramacao.ex4;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite um número inteiro A: ");
	    int a = scanner.nextInt();

	    System.out.print("Digite um número inteiro B: ");
	    int b = scanner.nextInt();

	    int c = a;
	    
	    a = b;
	    
	    b = c;
	    
	    System.out.print("A =  " +a);
	    
	    System.out.print("\nB =  " +b);
	}

}
