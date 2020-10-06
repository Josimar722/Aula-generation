package programa;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args){
		Scanner p = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = p.nextLine();
		
		System.out.println("Digite sua idade em anos: ");
		int anos = p.nextInt();
		
		System.out.println("Digite os meses: ");
		int mes = p.nextInt();
		
		System.out.println("Digite os dias: ");
		int dias = p.nextInt();
		
		int dias_mes = 30;
		int dias_ano = 365;
		dias += (anos * dias_ano) + (mes * dias_mes);
		
		System.out.println(nome +" Sua idade em dias são: "+ anos + mes+ dias);
	}
}