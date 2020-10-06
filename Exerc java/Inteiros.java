package programa;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int  n1,n2,n3;
		
		System.out.println("Digite o primeiro número: ");
		 n1 = num.nextInt();
		 
		 System.out.println("Digite o segundo número: ");
		 n2 = num.nextInt();
		 
		 System.out.println("Digite o terceiro número: ");
		 n3 = num.nextInt();
		 
		 
		 if(n1 > n2) 
		 {
			 System.out.println("\nO nº maior é: " + n1);
			 
		 }
		 
		 else if(n2 > n3)
		 {
			 System.out.println("\nO nº maior é: "+ n2);
		 }
		 
		 
		 else if(n3 > n1)
		 {
			 System.out.println("\nO nº maior é: " + n3);
		 }
		 
	}

}
