package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Lambda - function
		 */

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Classe UpperCaseName implementa
		// interface Funcition
		/*
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		// ou usando metodo static
		/*
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		// ou usando nao metodo static
		/*
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		// Lambda declarada
		/*	
		Function<Product, String> func = p -> p.getName().toUpperCase();

		List<String> names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);
		 */
		
		// Lambda inLine
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);

		
	}

}
