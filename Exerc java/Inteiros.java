package programa;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int  n1,n2,n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		 n1 = num.nextInt();
		 
		 System.out.println("Digite o segundo n�mero: ");
		 n2 = num.nextInt();
		 
		 System.out.println("Digite o terceiro n�mero: ");
		 n3 = num.nextInt();
		 
		 
		 if(n1 > n2) 
		 {
			 System.out.println("\nO n� maior �: " + n1);
			 
		 }
		 
		 else if(n2 > n3)
		 {
			 System.out.println("\nO n� maior �: "+ n2);
		 }
		 
		 
		 else if(n3 > n1)
		 {
			 System.out.println("\nO n� maior �: " + n3);
		 }
		 
	}

}
