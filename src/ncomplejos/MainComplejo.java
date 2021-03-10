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
			System.out.println("1. Sumar Complejos");
			System.out.println("2. Restar Complejos");
			System.out.println("3. Salir");
			System.out.println("Introduce la opción");
			opc = teclado.nextLine().charAt(0);
			
			switch(opc) {
			case '1':
				p1.suma(p1);
				break;
			case '2':
				p1.resta(p1);
				break;
			case '3':
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Introduzca una opción válida");
			}
		}
	}

}
