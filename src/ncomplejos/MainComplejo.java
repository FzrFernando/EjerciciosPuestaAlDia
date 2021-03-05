package ncomplejos;

import java.util.Scanner;

public class MainComplejo {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double parteReal, parteImaginaria;
		
		System.out.println("Introduce la parte real");
		parteReal = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Introduce la parte imaginaria");
		parteImaginaria = Double.parseDouble(teclado.nextLine());
		
		Complejo p1 = new Complejo(parteReal, parteImaginaria);
		
		char opc = ' ';
		
		while(opc != '3') {
			
		}
	}

}
