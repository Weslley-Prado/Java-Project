package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3MaiorEMedia {

	public static void main(String[]args) {
		        @SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);	
			    int num;
			    int maior = 0;
			    int count = 0;
			    int soma = 0;

			do{
				
			   System.out.println("Digite 5 numeros ");
			   num =scan.nextInt();
			   soma += num;
			   if (num > maior) maior = num;			   
			   count +=1;
			   
			 } while (count < 5);

			System.out.println("Maior: " +maior);
			System.out.println("Soma: " +soma);
			System.out.println("Média: " +soma/5);

		}

	}

