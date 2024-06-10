package atividade_laco_repeticao_for;

import java.util.Scanner;

public class atividade_while3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int maiores = 0, menores = 0, idade = 0, contador = 0;
		
		while (idade != -1) {
			
		System.out.println("Digite uma idade:");
		idade = leia.nextInt();
		
		if (idade== -1)
		break; // se a idade for negativa, interrompe o loop 
		contador++; 
		
		if (idade < 21)
		menores++;
		
		if (idade > 50)
		maiores++;

		}
		System.out.println("Total de pessoas menores de 21: " + menores);
		System.out.println("Total de pessoas maiores de 50: " + maiores);
	}
}
