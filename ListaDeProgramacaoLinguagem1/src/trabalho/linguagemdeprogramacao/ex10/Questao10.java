package trabalho.linguagemdeprogramacao.ex10;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
	        int numeroDigitado;
	        boolean parar = false;
	        char texto;

	        do {
	            System.out.print("Digite um número inteiro: ");
	            numeroDigitado = entrada.nextInt();

	            if(numeroDigitado > 0) {
	                System.out.println("O número " + numeroDigitado + " é positivo" );
	            }else{
	                System.out.println("O número " + numeroDigitado + " é negativo" );
	            }
	            if(numeroDigitado % 2 == 0) {
	                System.out.println("E o número " + numeroDigitado + " é par" );
	            }else{
	                System.out.println("E o número " + numeroDigitado + " é ímpar" );
	            }
	            
	            System.out.print("Deseja encerrar o programa ? (s/n) ");
	            
	            texto = entrada.next().charAt(0);
	            
	            if(texto == 's' || texto == 'S') {
	                parar = true;
	            }
	            
	        }while(parar == false);

	        System.exit(0);
	}

}
