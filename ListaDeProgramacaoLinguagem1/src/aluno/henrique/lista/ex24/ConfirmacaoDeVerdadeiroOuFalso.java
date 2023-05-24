package aluno.henrique.lista.ex24;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConfirmacaoDeVerdadeiroOuFalso {

	public static void main(String[] args) {
		boolean [][] principal;
		TrocaLinhaColuna tlc = new TrocaLinhaColuna();
		int tamanhoDoVet;
		boolean verdOuFal;
		
		tamanhoDoVet = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tamanho do vetor:"));
		
		principal = new boolean [tamanhoDoVet][tamanhoDoVet];
		
		for(int l = 0; l < principal.length; l++) {
			for(int c = 0; c < principal.length; c++) {
				verdOuFal = Boolean.parseBoolean
						(JOptionPane.showInputDialog("Entre com um valor true ou false:"));
				principal[l][c] = verdOuFal; 
			}
		}
		
		System.out.println("Matriz Normal");
		tlc.mostraMensagem(principal);
		
		boolean [][] matrizMudada = tlc.trocarLinhaColuna(principal);
		
		System.out.println("Matriz transposta");
		tlc.mostraMensagem(matrizMudada);
		
		
		
		
	}

}
