package trabalho.linguagemdeprogramacao.ex13;

import javax.swing.JOptionPane;

public class MatrizAoDerredorZeros {
	public static void main(String[] args) {
		
		String sequencia = JOptionPane.showInputDialog("Digite a sequencia de números com espaços brancos entre eles:");
		
		String[] numeros = sequencia.split(" ");
		
		int [] vetorPrimeiro = new int[numeros.length];
		
		for(int i = 0; i < numeros.length; i++) {
			vetorPrimeiro[i] = Integer.parseInt(numeros[i]);
		}
		
		//Determina o tamanho da matriz.
		int tamanho = (int) Math.ceil(Math.sqrt(numeros.length));
		
		int[][] vetorPrincipal = new int[tamanho][tamanho];
		
		for(int i = 0; i < vetorPrimeiro.length; i++) {
			int linha = i / tamanho;
			int coluna = i % tamanho;
			vetorPrincipal[linha][coluna] = vetorPrimeiro[i];
		}
		
		for(int l = 0; l < tamanho; l++) {
			for(int c = 0; c < tamanho; c++) {
				System.out.print(vetorPrincipal[l][c] + " ");
			}
			
			System.out.print("\n");
		}
	}
}

	
	

