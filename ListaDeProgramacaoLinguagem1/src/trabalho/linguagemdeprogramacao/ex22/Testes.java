package trabalho.linguagemdeprogramacao.ex22;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		Hipotenusa h = new Hipotenusa();
		
		Scanner s1 = new Scanner(System.in);

	    System.out.print("Qual é o tamanho da base?: ");
	    double base = s1.nextDouble();
	    
	    System.out.print("Qual é o tamanho da altura?: ");
	    double altura = s1.nextDouble();

	    System.out.println("Sua hipotenusa é: " + h.hipotenusa(base,altura));

	    s1.close();
	}

	

}
