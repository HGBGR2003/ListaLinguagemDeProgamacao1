package aluno.henrique.lista.ex24;

public class TrocaLinhaColuna {
	
	public static boolean[][] trocarLinhaColuna(boolean [] [] vetorPrincipal) {
		int tamanhoVetor = vetorPrincipal.length ;
		
		boolean [][] transpostaQuadrada = new boolean [tamanhoVetor][tamanhoVetor];
		
		for(int l = 0; l < tamanhoVetor; l++) {
			for(int c = 0; l < tamanhoVetor;c++) {
				vetorPrincipal[l][c] = vetorPrincipal[c][l];		
			}
		}
		return transpostaQuadrada;
	}

	public static void mostraMensagem (boolean [][] vetorPrincipal) {
		int tamanhoVetor = vetorPrincipal.length;
		
		for(int l = 0; l < tamanhoVetor; l++) {
			for(int c = 0; c < tamanhoVetor; c++) {
				if(vetorPrincipal[l][c] && vetorPrincipal[c][l]) {
					System.out.println(vetorPrincipal[l][c] + " ");
				}
				
			}
		}
	}
}