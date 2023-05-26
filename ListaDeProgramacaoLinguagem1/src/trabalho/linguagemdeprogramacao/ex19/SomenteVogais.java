package trabalho.linguagemdeprogramacao.ex19;

import javax.swing.JOptionPane;

public class SomenteVogais {

	public static void main(String[] args) {
		String frase;
		
		frase = JOptionPane.showInputDialog("Entre com uma frase: (Sem acento)");
				
		for(int i = 0; i < frase.length(); i++) {
			char vogais = frase.toLowerCase().charAt(i);
			
			if (vogais == 'a' || vogais == 'e' || vogais == 'i' || vogais == 'o' || vogais == 'u') {
				System.out.println("As vogais da frase : " + vogais + " ");
			}
			
		}
	}


}


