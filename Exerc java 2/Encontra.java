package programa;

import java.util.Scanner;

public class Encontra {

	public static void main(String[] args) {
		
		int Num, soma=0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		Num = n.nextInt();
		System.out.println("Digite outro número: ");
		soma = n.nextInt();
		
		do {
			
			soma = soma + Num;
			
		}while(Num == 0); 
		{ 
			
		}
		
		System.out.println("A soma dos números são: " + soma);
		
	}

}
