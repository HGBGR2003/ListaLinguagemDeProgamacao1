package aluno.henrique.lista.ex11;

import javax.swing.JOptionPane;

public class VetorMaiorOuMenor {

	public static void main(String[] args) {
		int i;
		int[] vetorPrincipal;
		int valorUsuario = 0;
		int valorDigitado = 0;
		int maior = 0;
		int menor = 0;

		valorDigitado = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número que deve ser percorrido o Array"));
		vetorPrincipal = new int [valorDigitado];
				
		while(true) {
			for(i = 0; i < vetorPrincipal.length; i++) {
				valorUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
				if(valorUsuario == 0) {
					System.exit(valorUsuario);
				}
				vetorPrincipal[i] = valorUsuario;
				
				if(vetorPrincipal[i] > maior) {
					maior = vetorPrincipal[i];
		
				}
				
				System.out.println("O Maior número é " + maior);
				System.out.println("--------------------------");
				
				if(vetorPrincipal[i] < maior) {
					menor = vetorPrincipal[i];
				}
				
				System.out.println("O menor número é " + menor);
				System.out.println("--------------------------");
			}
			
		}	
		
	}
}

