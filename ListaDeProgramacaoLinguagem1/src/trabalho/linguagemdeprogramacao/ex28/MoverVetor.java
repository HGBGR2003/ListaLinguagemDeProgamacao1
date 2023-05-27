package trabalho.linguagemdeprogramacao.ex28;

public class MoverVetor {
	public static void moverArray(int[] array) {
		int esquerda = 0;
	    int direita = array.length - 1;

	    while (esquerda < direita) {
	    	while (array[esquerda] < 0 && esquerda < direita) {
	    		esquerda++;
	        }

	        while (array[direita] >= 0 && esquerda < direita) {
	        	direita--;
	        }

	        if (esquerda<direita) {
	        	int temp = array[esquerda];
	            array[esquerda] = array[direita];
	            array[direita] = temp;
	        }
	    }
    }
}	
