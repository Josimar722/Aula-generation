package programa;

import java.util.Scanner;

public class PrimeiroMatriz {
	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		int lin,col, cont=0;
         
		Scanner m = new Scanner(System.in);
		
		System.out.println("Mostrando Matriz[3][3]..");
		
		
		for(lin =0; lin<3; lin++)
		{
			for(col =0; col<3; col++)
			{
				System.out.println("Digite os valores das matrizes: " + lin + ":" + col);
				matriz[lin][col]= m.nextInt();
			}
			
		}
		
		for(lin =0; lin<3; lin++)
		{
			for(col =0; col<3; col++)
			{
				if(matriz[lin][col] > 10) {
					cont ++;
				}
				
			}
				
		}System.out.println("A quantidade maiores que 10 foram: " + cont );
		
		
	}

}
