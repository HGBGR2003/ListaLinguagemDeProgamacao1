package trabalho.linguagemdeprogramacao.ex23;

public class Mudanca {
	 public static int[][] trocarLinhasPorColunas(int[][] vetor) {
	        int tamanhoDaMatriz = vetor.length;
	        int[][] matrizTransposta = new int[tamanhoDaMatriz][tamanhoDaMatriz];
	        
	        for (int linha = 0; linha < tamanhoDaMatriz; linha++) {
	            for (int coluna = 0; coluna < tamanhoDaMatriz; coluna++) {
	                matrizTransposta[linha][coluna] = vetor[coluna][linha];
	            }
	        }
	        
	        return matrizTransposta;
	    }
	    
	  public static void exibirMatriz(int[][] vetor) {
	        int tamanhoDaMatriz = vetor.length;
	        
	        for (int linha = 0; linha < tamanhoDaMatriz; linha++) {
	            for (int coluna = 0; coluna < tamanhoDaMatriz; coluna++) {
	                System.out.print(vetor[linha][coluna] + " ");
	            }
	            System.out.println();
	        }
	    }
	

}
