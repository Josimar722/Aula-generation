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
		
		Animal2 bicho2 = new  Animal2("Alaz�o", 0);
		bicho2.setAnimal("Alaz�o");
		bicho2.setIdade(6);
		
		Animal3 bicho3 = new  Animal3("Garibaldo", 0);
		bicho3.setAnimal("Garibaldo");
		bicho3.setIdade(3);
		
		System.out.println(bicho1.getAnimal());
		System.out.println(bicho2.getAnimal());
		System.out.println(bicho3.getAnimal());
		
		System.out.println("**********************");
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("\nEntre com a sua op��o: ");
		System.out.println("\nOp��o 1: Cachorro ");
		System.out.println("\nOp��o 2: Cavalo");
		System.out.println("\nOp��o 3: Bicho Pregui�a");
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
			System.out.println("Me desculpe n�o sei como o bicho pregui�a se comunica kk!!!");
			break;
		default:
			System.out.println("Op��o inv�lida");
		}	
		
		
	}

}
