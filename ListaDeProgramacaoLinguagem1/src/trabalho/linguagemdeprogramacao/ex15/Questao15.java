package trabalho.linguagemdeprogramacao.ex15;

import javax.swing.JOptionPane;

public class Questao15 {

	public static void main(String[] args) {
		String[] nomeCanditadas = new String[10];
		int[] idadeCanditadas = new int[10];
		String nomes;
		int idades;
		
		for(int i = 0; i < idadeCanditadas.length; i++) {
			nomes = JOptionPane.showInputDialog("Entre com seu nome moça:");
			idades = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade moça entre 18 e 20 anos:"));	
			nomeCanditadas[i] = nomes;
			idadeCanditadas[i] = idades;
			
			if(idadeCanditadas[i] >= 18 && idadeCanditadas[i] <= 20) {
				System.out.println("Você " + nomeCanditadas[i] + " está apta á participar do concurso pois sua idade "
						+ "entre 18 e 20");
				System.out.println("------------------------------------------------------------------------------");
			}else {
				System.out.println("Você " + nomeCanditadas[i] +  " não pode participar pois sua idade não está nos parametros de 18 e 20 anos para poder participar do concurso, sinto muito!");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			
			}
			
		}

	}

}
