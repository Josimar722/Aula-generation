package programa;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		
		Scanner n = new Scanner(System.in);
		
		 System.out.println("Digite a nota1: ");
		 int n1 = n.nextInt();
		 
		 System.out.println("Digite a nota 2: ");
		 int n2 = n.nextInt();
		 
		 System.out.println("Digite a nota3: ");
		 int n3 = n.nextInt();
		 
		 int media = ((n1*2) + (n2*3) + (n3*5))/10;
		 
		 System.out.println("A média das notas são: " + media);
		 

	}

}
