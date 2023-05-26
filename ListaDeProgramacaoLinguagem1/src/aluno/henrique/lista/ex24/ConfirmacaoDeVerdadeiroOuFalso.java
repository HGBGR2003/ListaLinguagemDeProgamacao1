package aluno.henrique.lista.ex24;

import javax.swing.JOptionPane;

public class ConfirmacaoDeVerdadeiroOuFalso {

	public static void main(String[] args) {
		boolean [][] principal;
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
				
		for(int l = 0; l < principal.length; l++) {
			for(int c = 0; c < principal.length; c++) {
				boolean valorResultado = false;
				valorResultado = principal[l][c] && principal[c][l];
				System.out.println("Resultado da operação AND entre posição (" + l + ", " + c + ") e posição (" + c + ", " + l + "): " + valorResultado);
			}
		}
	}

}
