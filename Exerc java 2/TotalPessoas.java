package programa;

import java.util.Scanner;

public class TotalPessoas {

	public static void main(String[] args) {
		
		int idade, cont21=0, cont50=0;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = n.nextInt();
		
		while(idade!=-99)
		{ 
		    System.out.println("Digite sua idade: ");
		    idade = n.nextInt();
		    
			if(idade < 21)
			{
				cont21++;
			}
			if(idade>50)
			{
				cont50++;
				System.out.println("\nDigite -99 para encerrar: ");
				idade = n.nextInt();
			}
			
		}
		
		System.out.println("\nO total com menos de 21 anos é: " + cont21);
		System.out.println("\nJá o total de pessoas com mais de 50 anos é: "+ cont50);

	}  

}
