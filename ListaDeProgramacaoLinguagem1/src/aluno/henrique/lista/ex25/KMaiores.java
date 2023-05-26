package aluno.henrique.lista.ex25;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class KMaiores {

	public static void main(String[] args) {
		PercorrendoOsMaiores pom = new PercorrendoOsMaiores();
		int [][] vetorPadrao;
		int numerosVetor;
		int linhas;
		int colunas;
		
		linhas = Integer.parseInt(JOptionPane.showInputDialog("Entre com número de linhas:"));
		colunas = Integer.parseInt(JOptionPane.showInputDialog("Entre com número de colunas:"));
		
		vetorPadrao = new int [linhas][colunas];
		
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				numerosVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
				vetorPadrao[linha][coluna] = numerosVetor;
			}
		}
		
		int k = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de K:"));
		
		int[] elementos = pom.obterOsMaioresElementosDoVetor(vetorPadrao, k);
				
		System.out.println("Os " + k + " maiores elementos são:");
		System.out.println(Arrays.toString(elementos));
		
	}

}
