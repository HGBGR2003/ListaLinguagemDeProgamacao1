package trabalho.linguagemdeprogramacao.ex27;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        
        int decimal = scanner.nextInt();

        int binario = 0, base =1, resto;

        while (decimal > 0) {
            resto = decimal % 2;
            binario += resto * base;
            decimal /= 2;
            base *= 10;
        }
        
        System.out.print(binario);

	}

}
