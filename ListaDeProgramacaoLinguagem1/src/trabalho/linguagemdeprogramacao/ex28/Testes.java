package trabalho.linguagemdeprogramacao.ex28;

public class Testes {

	public static void main(String[] args) {
		int[] array = {55, -2, 47, -11, 7, -42, 10, -3};
		
        MoverVetor mover = new MoverVetor();
        
        mover.moverArray(array);

        System.out.print("Array após mover os números: ");
        
        for (int num : array) {
            System.out.print(num + " ");
        }

	}

}
