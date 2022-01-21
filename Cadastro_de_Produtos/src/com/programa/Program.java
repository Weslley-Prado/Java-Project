package com.programa;

import java.util.Locale;
import java.util.Scanner;

import com.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();

		System.out.println("Enter product");
		System.out.println("Name:");
		product.name = sc.nextLine();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock:");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		//In this command, the user adds a product
		System.out.print("Enter the number of products to "
				+ "be added in stock: ");
		int quantity = sc.nextInt();
		// addition methods
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		//remove methods
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}