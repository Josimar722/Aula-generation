package programa;

import java.util.Scanner;

public class Categoria {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = p.nextInt();
		
		
		if(idade >= 10 && idade <= 14 )
		{
			System.out.println("Você está na categoria infantil");
		}
		
		else if(idade >= 15 && idade <= 17)
		{
			System.out.println("Você está na categoria Juvenil");
		}
		
		else if(idade >= 18 && idade<= 25)
		{
			System.out.println("Você é adulto");
		}
		else 
		{
			System.out.println("Idade inválida");
		}
	
	}

}
