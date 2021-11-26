package br.com.dio.exercicios.array;

import java.util.Scanner;

public class Desafio2 {

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			

			for(int i=0 ; i<n ; i++) {
				int x = sc.nextInt();
	       System.out.println(((long) Math.pow(2, x - 2)) / 3000 + " kg");		}
			sc.close();
		}
	}

