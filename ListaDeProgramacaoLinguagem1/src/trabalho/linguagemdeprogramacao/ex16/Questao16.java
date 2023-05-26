package trabalho.linguagemdeprogramacao.ex16;

import javax.swing.JOptionPane;

public class Questao16 {

	public static void main(String[] args) {
		int[] v1;
		int[] v2;
		int valores1;
		int valores2;
		int contador = 0;
		int usuarioDigitou;
		
		usuarioDigitou = Integer.parseInt(JOptionPane.showInputDialog("Entre com tamanho do vetor de até 50 :"));
		v1 = new int[usuarioDigitou];
		v2 = new int[usuarioDigitou];
		
		for(int i = 0; i < usuarioDigitou;i++) {
		  valores1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com os valores para o primeiro vetor:"));	  
		  v1[i] = valores1;
		}
	
		for(int i = 0; i < usuarioDigitou;i++) {
			valores2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com os valores do segundo vetor:"));
			v2[i] = valores2;
		}
		
		for(int i = 0; i < usuarioDigitou; i++) {
			if(v1[i] == v2[i]) {
				contador++;
			}
		}
		
		if(contador == 0) {
			System.out.println("V1 e V2 não possuem valores idênticos nas mesmas posições.");
		}else {
			System.out.println("V1 e V2 possuem " + contador + " valores idênticos nas mesmas posições.");
		}
		
	}

}
