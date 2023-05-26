package trabalho.linguagemdeprogramacao.ex17;

import javax.swing.JOptionPane;

public class Questao17 {

	public static void main(String[] args) {
		int numeroAleatorio = (int) Math.floor(Math.random() * 100) + 1;
		int tentativaUsuario = 0;
		int contador = 0;
		
		while(numeroAleatorio != tentativaUsuario) {
			tentativaUsuario = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 0 á 100, e tente acertar junto com a máquina:"));
			if (numeroAleatorio > tentativaUsuario) {
				contador++;
				System.out.println("O número informado é Menor que o valor sorteado");
			}
			
			if (numeroAleatorio < tentativaUsuario) {
				contador++;
				System.out.println("O número informado é Maior que o valor sorteado");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Parabéns você acertou!!, A quantidade de tentativas foi de " + contador);

		JOptionPane.showMessageDialog(null, "O número sorteado foi: " + numeroAleatorio);
	}
}
