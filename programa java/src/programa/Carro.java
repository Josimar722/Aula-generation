package programa;

import java.util.Scanner;

public class Carro {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		System.out.println("Digite o pre�o de f�brica do carro: ");
		double cf = c.nextDouble();
		
		double perd = (cf * 0.28) + cf;
		double custc = (perd * 0.45) + perd;
		
		System.out.println("O valor do autom�vel �: " + custc);

	}

}
