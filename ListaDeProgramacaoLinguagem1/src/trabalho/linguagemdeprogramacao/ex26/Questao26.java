package trabalho.linguagemdeprogramacao.ex26;

import java.util.Arrays;
import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[][] array = {
                {3, 42, 27},
                {4, 15, 64},
                {5, 55, 9}
        };

        System.out.println("Informe qual elemento deseja analisar: ");
        
        int k = scanner.nextInt();

        int[] flattenedArray = Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .toArray();

        Arrays.sort(flattenedArray);

        if (k > 0 && k <= flattenedArray.length) {
        	
            int kthSmallest = flattenedArray[k - 1];
            
            int kthLargest = flattenedArray[flattenedArray.length - k];

            System.out.printf("O %dº menor elemento é: %d",k ,kthSmallest);
            
            System.out.printf("\nO %dº maior elemento é: %d",k ,kthLargest);
            
        } else {
            System.out.println("Valor de k inválido!");
        }

	}

}
