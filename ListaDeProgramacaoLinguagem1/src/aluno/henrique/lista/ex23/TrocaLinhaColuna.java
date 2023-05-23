package aluno.henrique.lista.ex23;

import javax.swing.JOptionPane;

public class TrocaLinhaColuna {
	public static void main(String[] args) {
		Mudanca mu = new Mudanca();
		int [][] vetorPrincipal;
		int digitadoPeloUsuarioTamanho;
		int numeroNoVetor;
		
		digitadoPeloUsuarioTamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do array?"));
		vetorPrincipal = new int [digitadoPeloUsuarioTamanho][digitadoPeloUsuarioTamanho];
		
		for(int linha = 0; linha < vetorPrincipal.length; linha++) {
			for(int coluna = 0; coluna < vetorPrincipal.length; coluna++) {
				numeroNoVetor = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número:"));
				vetorPrincipal[linha][coluna] = numeroNoVetor;
			}
		}

		System.out.println("Matriz Original");
		System.out.println("-------------------");
		mu.exibirMatriz(vetorPrincipal);
		
		System.out.println("---------------------");
		
		
		int [][] matrizTransposta = mu.trocarLinhasPorColunas(vetorPrincipal);
		
		System.out.println("Matriz Transposta");
		System.out.println("--------------------");
		mu.exibirMatriz(matrizTransposta);
	}

}
