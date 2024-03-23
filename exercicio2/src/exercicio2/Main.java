package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner (System.in);
		
		int negativo, naoNegativo;
		
		System.out.println("Digite um numero!:");
		negativo = sc.nextInt();
		
		if (negativo <0) {
			System.out.println("negativo");
			}
		
		else {
			System.out.println("Não negativo");
		}
		
		
      sc.close();
	}

}
