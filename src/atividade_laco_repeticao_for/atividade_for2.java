package atividade_laco_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class atividade_for2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);

		int pares = 0, impares = 0, numeros;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			numeros = leia.nextInt();// armazenando os valores digitador

			if (numeros % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}
		

		}
		System.out.println("Total de números pares:"+pares);
	
		System.out.println("total de números imapres:"+impares);
	}
	
}
