package aluno.henrique.lista.ex12;

import java.math.BigInteger;

public class ValorRecebidoMonje {

	public static void main(String[] args) {
		int totalQuadros = 64;
		BigInteger graos = BigInteger.valueOf(1);
		BigInteger totalGraos = BigInteger.valueOf(0);
		
		for(int i = 1; i <= totalQuadros; i++) {
			totalGraos = totalGraos.add(graos);
			graos = graos.multiply(BigInteger.valueOf(2));
		}
		System.out.println("Total de grãos recebidos: " + totalGraos);
	}

}
