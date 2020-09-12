package com.learning.console;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.learning.book.GridCalculate;

public class MakeGrid {
	public static void main(String[] args) {
		GridCalculate gridcalculate = new GridCalculate();
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("porfavor ingrese el largo del la hoja");
			double heigth = scanner.nextDouble();
			System.out.println("porfavor ingrese el ancho de la hoja");
			double width = scanner.nextDouble();
			scanner.close();
			System.out.println("==================================");
			System.out.println("| la hoja tiene: "+gridcalculate.measurements(width, heigth) +" cuadros |");
			System.out.println("==================================");
			
		}catch (NumberFormatException | InputMismatchException e) {
			System.out.println("solo se permiten numeros");
			System.exit(0);
		}
		
		
	}

	
}
