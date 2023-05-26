package trabalho.linguagemdeprogramacao.ex25;

import java.util.Arrays;

public class Testes {
	public static int[] obterOsMaioresElementosDoVetor(int [][] vetor, int k) {
		int totalElementos = vetor.length * vetor[0].length;
		
		if(k > totalElementos) {
			k = totalElementos;
		}
		
		int [] elementosVetor = new int [totalElementos];
		int indice = 0;
		
		for(int [] linha:vetor) {
			for(int elemento: linha) {
				elementosVetor[indice] = elemento;
				indice++;
			}
		}
		
		Arrays.sort(elementosVetor);
		
		int [] maioresElementosDoVetor = Arrays.copyOfRange(elementosVetor, totalElementos - k, totalElementos);
		return maioresElementosDoVetor;
	}
}
