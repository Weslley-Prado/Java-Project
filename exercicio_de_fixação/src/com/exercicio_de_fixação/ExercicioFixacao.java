package com.exercicio_de_fixação;

import java.util.Locale;

public class ExercicioFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";


		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n %s, which price is $ %.2f %n %s, which price is %.2f %n", 
				product1, price1, product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, %d  and gender %s %n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded with three decimal places: %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f" , measure);


	}

}
