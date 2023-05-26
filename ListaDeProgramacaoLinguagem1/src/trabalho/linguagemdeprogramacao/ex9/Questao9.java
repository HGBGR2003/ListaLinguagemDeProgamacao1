package trabalho.linguagemdeprogramacao.ex9;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
	        boolean parar = false;
	        char texto;

	        do {
	            System.out.print("Escreva o código: ");
	            entrada.nextInt();

	            System.out.print("Qual foi o número de horas trabalhadas: ");
	            int horasDeTrabalho = entrada.nextInt();

	            double salario;
	            int excedente;

	            if (horasDeTrabalho > 50) {
	                int horasExtra = horasDeTrabalho - 50;
	                salario = 50 * 10;
	                excedente = horasExtra * 20;

	                System.out.println("Total do salário R$: " + salario + excedente);
	                System.out.println("Apenas o sálario das horas extras R$: " + excedente);

	            } else {
	                salario = horasDeTrabalho * 10;
	                System.out.println("Total do salário (sem horas extras)R$: " + salario);
	            }

	            System.out.print("Deseja encerrar o programa ? (s/n) ");
	            texto = entrada.next().charAt(0);

	            if(texto =='s' || texto=='S') {
	                parar = true;
	            }
	            
	          }while(parar == false);

	          System.exit(0);
	}

}
