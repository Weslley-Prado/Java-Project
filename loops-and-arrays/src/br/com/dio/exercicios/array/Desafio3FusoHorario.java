package br.com.dio.exercicios.array;
import java.util.Scanner;

public class Desafio3FusoHorario {

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			int horasaida = sc.nextInt();
			int tempoviagem = sc.nextInt();
			int fuso = sc.nextInt();
			
			if (horasaida == 0)
				horasaida = 24;
			
			int ajuste = horasaida + tempoviagem + fuso;
			
			if (ajuste >=24)
				ajuste -= 24;  //Escreva a sua lógica aqui	             
			
			System.out.println(ajuste);		
 }
}
