package trabalho.linguagemdeprogramacao.ex3;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     System.out.print("Digite o primeiro número: ");
	     int n1 = scanner.nextInt();

	     System.out.print("Digite o segundo número: ");
	     int n2 = scanner.nextInt();

	     System.out.print("Digite o terceiro número: ");
	     int n3 = scanner.nextInt();

	     System.out.println("Relacionamentos de ordem:");
	     // Verifica igualdade
	        
	     if (n1 == n2 && n2 == n3) {
	    	 System.out.println("Todos iguais");
	     }else {
	    	 if (n1 == n2){
	    		 if (n1>n3) System.out.println("N1 e N2 são IGUAIS e maióres que N3");
	             if (n1<n3) System.out.println("N1 e N2 são IGUAIS e menores que N3");
	         }

	         if (n1==n3 ){
	             if (n1>n2) System.out.println("N1 e N3 são IGUAIS e maióres que N2");
	             if (n1<n2) System.out.println("N1 e N3 são IGUAIS e menores que N2");
	         }

	         if (n2==n3){
	                if (n2>n1) System.out.println("N2 e N3 são IGUAIS e maióres que N1");
	                if (n2<n1) System.out.println("N2 e N3 são IGUAIS e menores que N1");
	         }

	         	if(n1 != n2 && n1 != n3 && n2!=n3) System.out.println("OS números são diferentes ");
	        }

	    }
}
