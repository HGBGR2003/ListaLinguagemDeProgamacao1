package trabalho.linguagemdeprogramacao.ex8;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		 Scanner s1 = new Scanner (System.in);

	     System.out.print("A tabuada do número: ");
	     int numeroDigitado = s1.nextInt();

	     System.out.println("---- Tabuada do " + numeroDigitado + " ----");

	     for(int x = 1; x <= 10; x++) {
	    	 System.out.println(numeroDigitado + " x " + x + " = " + numeroDigitado*x);
	     }

	      s1.close();
	 }

}
