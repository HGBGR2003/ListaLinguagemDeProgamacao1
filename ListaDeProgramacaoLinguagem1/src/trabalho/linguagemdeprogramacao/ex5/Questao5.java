package trabalho.linguagemdeprogramacao.ex5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Digite um número");
	    int num = scanner.nextInt();

	    if(num >= 0){
	    	System.out.println("O módulo do número digitado é: " +num);
	    }

	    else {
	    	System.out.println("O módulo do número digitado é: " +num*-1);
	    }

	}

}
