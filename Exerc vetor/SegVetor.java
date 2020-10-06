package programa;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;

public class SegVetor {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);

		List quantpar = new ArrayList<>();

		List quantIm = new ArrayList<>();

		int i;
		int num, soma = 0;

		for (i = 0; i < 6; i++) {
			System.out.println("Digite o valor dos vetores: " + i + ":" + 1 + "->");
			num = v.nextInt();

			if (num % 2 == 0) {
				
				quantpar.add(num);
				soma = soma + num;
			}

			else {
				quantIm.add(num);
				
			}
		}
		System.out.println("Números pares digitados: " + quantpar);
		System.out.println("Soma dos números pares: " + soma);
		System.out.println("Números ímpares digitados: " + quantIm);
		System.out.println("Quantidade de ímpares digitados: " + quantIm.size());
	}

}
