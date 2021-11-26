package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4ParEImpar {
	
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num;
		int quantidadeNum = 0;
		int quantidadePar = 0, quantidadeImpar =0;
		
		System.out.println("Digite a quantidade de números desejadas:");
		quantidadeNum = scan.nextInt();
		int count = 0;		
		
		do {
		     System.out.println("Digite um número:");
		     num = scan.nextInt();
		     if (num % 2 ==0 ) quantidadePar++;
		     else quantidadeImpar++;
		     count++;   			 
	       } while (count < quantidadeNum );	
		
		System.out.println("Quantidade de números pares:" +quantidadePar);
		System.out.println("Quantidade de números pares:" +quantidadeImpar);
	}
}
