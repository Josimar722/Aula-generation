package programa;

import java.util.Scanner;

public class Ler10num {
	
	public static void main(String args[])
	{
		int ler, p=0, imp=0;
		Scanner n = new Scanner(System.in);
	
		for(ler=0; ler<10; ler++) 
		{
			if(ler !=0){
				System.out.printf("Digite um n�mero: ");
				ler = n.nextInt();
			}
			if(ler % 2==0) {
				
				p = p + 1;
			}
			
			else
			{
				imp = imp - 1;
			}
		} 
		System.out.printf("\nQuanti de pares: %d", p);
		System.out.printf("\nQuanti de �mpares: %d", imp);
	}

}
