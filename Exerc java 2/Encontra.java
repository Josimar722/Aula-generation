package programa;

import java.util.Scanner;

public class Encontra {

	public static void main(String[] args) {
		
		int Num, soma=0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		Num = n.nextInt();
		System.out.println("Digite outro n�mero: ");
		soma = n.nextInt();
		
		do {
			
			soma = soma + Num;
			
		}while(Num == 0); 
		{ 
			
		}
		
		System.out.println("A soma dos n�meros s�o: " + soma);
		
	}

}
