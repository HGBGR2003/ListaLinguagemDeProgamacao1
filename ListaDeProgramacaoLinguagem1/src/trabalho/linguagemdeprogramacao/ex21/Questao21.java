package trabalho.linguagemdeprogramacao.ex21;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	     char[] alfabeto = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};

	     System.out.print("Digite um letra: ");
	     
	     char letra = (char) entrada.nextLine().toLowerCase().charAt(0);

	     System.out.print("Digite outra letra: ");
	     char letra2 = (char) entrada.nextLine().toLowerCase().charAt(0);

	     if(letra >= 'a' && letra <= 'z' && letra2 >= 'a' && letra2 <= 'z') {
	    	 if(letra <= letra2) {
	    		 
	    		 int diferenca = letra2 - letra - 1;
	    		 
	             System.out.println("O numero de letras entre eles é: "+ diferenca);
	             
	            }else {
	                System.out.println("Erro! Digite na ordem alfabética");
	            }
	        }

	        entrada.close();
	        alfabeto.clone();

	}

}
