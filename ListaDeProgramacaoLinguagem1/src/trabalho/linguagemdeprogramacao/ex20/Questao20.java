package trabalho.linguagemdeprogramacao.ex20;

import javax.swing.JOptionPane;

public class Questao20 {

	public static void main(String[] args) {
		int[] vetorPrincipal;
		int valorUsuario;
		int valorContador;
		int somatorio = 0;
		int maior = 0;
		double mediaVetor = 0;
		
		valorContador = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números dentro do array:"));
		vetorPrincipal = new int [valorContador];
		
		for(int i = 0; i < vetorPrincipal.length; i++) {
			valorUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número positivo:"));
			vetorPrincipal[i] = valorUsuario;
			somatorio = somatorio + vetorPrincipal[i];
			mediaVetor = somatorio / vetorPrincipal.length;
			if (vetorPrincipal[i] > maior ) {
				maior = vetorPrincipal[i];
			}
		}
		
		System.out.println("O somatório total é " + somatorio);
		System.out.println("A media é " + mediaVetor);	
		System.out.println("O maior valor no vetor é " + maior);
		
	}

}
