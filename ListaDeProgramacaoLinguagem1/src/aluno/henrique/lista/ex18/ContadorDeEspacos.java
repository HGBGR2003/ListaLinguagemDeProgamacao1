package aluno.henrique.lista.ex18;

import javax.swing.JOptionPane;

public class ContadorDeEspacos {

	public static void main(String[] args) {
		String fraseCaracteres = null;
		int cortaEContar = 0;
		
	    fraseCaracteres = JOptionPane.showInputDialog("Entre com uma frase de até 50 caracteres:");
	    StringBuilder fraseSemEspacos = new StringBuilder();
	    
	    for(int i = 0; i < fraseCaracteres.length(); i++) {
	    	char c = fraseCaracteres.charAt(i);
	    	
	    	if(c == ' ') {
	    		cortaEContar++;
	    	}else {
	    		fraseSemEspacos.append(c);
	    	}
	    }
	    
	    System.out.println("Frase sem espaços em branco: " + fraseSemEspacos.toString());
        System.out.println("Quantidade de espaços em branco: " + cortaEContar);
	    
	}
}
