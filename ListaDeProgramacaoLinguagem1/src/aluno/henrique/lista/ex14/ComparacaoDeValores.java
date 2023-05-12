package aluno.henrique.lista.ex14;

import javax.swing.JOptionPane;

public class ComparacaoDeValores {

	public static void main(String[] args) {
		int [] vetorNumerico = new int[10];
		int numeroDigitadoX;
		int valoresNoVetor;
		int contadorMaior = 0;
		int contadorMenor = 0;
		int contadorIgual = 0;
		
		numeroDigitadoX = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número qualquer X (inteiro e positivo):"));
		
		for(int i = 0; i < vetorNumerico.length;i++) {
			valoresNoVetor = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro e positivo ?"));
			vetorNumerico[i] = valoresNoVetor;
			System.out.println(vetorNumerico[i]);
			
			if(vetorNumerico[i] > numeroDigitadoX) {
				contadorMaior++;
			}else if(vetorNumerico[i] < numeroDigitadoX) {
				contadorMenor++;
			}else if(vetorNumerico[i] == numeroDigitadoX) {
				contadorIgual++;
			}
		}
		System.out.println("A quantidade de números maiores que X são " + contadorMaior);
	    System.out.println("A quantidade de números menores que X são " + contadorMenor);
	    System.out.println("A quantidade de números iguais á X são " + contadorIgual);
	}

}
