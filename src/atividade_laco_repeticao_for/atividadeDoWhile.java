package atividade_laco_repeticao_for;

import java.util.Scanner;
public class atividadeDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeros = 0, TotalPositivos=0;  
	
		
		do{
			
		System.out.println("Digite um número: ");
		numeros = leia.nextInt();
		
		if (numeros > 0 ) {
		TotalPositivos += numeros;
		}
		
		}while(numeros !=0);
		
		System.out.println("A soma dos números positivos é: "+TotalPositivos);
	}
} 
