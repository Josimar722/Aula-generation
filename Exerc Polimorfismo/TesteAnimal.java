package Polimorfismo;

import java.util.Scanner;

public class TesteAnimal extends Animal {
    public TesteAnimal(String string, int idade2) {
		super(string, idade2);
		// TODO Auto-generated constructor stub
	}

	static int op;
	
	public static void main(String args []) {
		
		Animal1 bicho1 = new  Animal1("Brutus", 0);
		bicho1.setAnimal("Brutus");
		bicho1.setIdade(5);
		
		Animal2 bicho2 = new  Animal2("Alazão", 0);
		bicho2.setAnimal("Alazão");
		bicho2.setIdade(6);
		
		Animal3 bicho3 = new  Animal3("Garibaldo", 0);
		bicho3.setAnimal("Garibaldo");
		bicho3.setIdade(3);
		
		System.out.println(bicho1.getAnimal());
		System.out.println(bicho2.getAnimal());
		System.out.println(bicho3.getAnimal());
		
		System.out.println("**********************");
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("\nEntre com a sua opção: ");
		System.out.println("\nOpção 1: Cachorro ");
		System.out.println("\nOpção 2: Cavalo");
		System.out.println("\nOpção 3: Bicho Preguiça");
		op = leitura.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("Hufu, hufu, hufu...");
			break;
		case 2:
			System.out.println("Innnriiii, inriii, iriii...");
			break;
		case 3:
			System.out.println("Me desculpe não sei como o bicho preguiça se comunica kk!!!");
			break;
		default:
			System.out.println("Opção inválida");
		}	
		
		
	}

}
