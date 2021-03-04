package ejercicios;

import java.util.Scanner;

public class MaquinaMain {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double monedero, dinero;
		
		System.out.println("Introduce el dinero inicial para el monedero");
		monedero = Double.parseDouble(teclado.nextLine());
		
		Maquina m1 = new Maquina(monedero);
		
		char opc=' ';
		while (opc != '6') {
			System.out.println("1.- Servir café");
			System.out.println("2.- Servir leche");
			System.out.println("3.- Servir café con leche");
			System.out.println("4.- Llenar depósitos");
			System.out.println("5.- Ver máquina");
			System.out.println("6.- Salir");
			System.out.println("Introduce la opción");
			opc =teclado.nextLine().charAt(0);
			
			switch(opc) {
				case'1':
					try {
						System.out.println("Introduzca el dinero para el café");
						dinero = Double.parseDouble(teclado.nextLine());
						double vuelta = m1.servirCafe(dinero);
						System.out.println("Su vuelta es " + vuelta);
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case'2':
					try {
						System.out.println("Introduzca el dinero para la leche");
						dinero = Double.parseDouble(teclado.nextLine());
						double vuelta = m1.servirLeche(dinero);
						System.out.println("Su vuelta es " + vuelta);
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case'3':
					try {
						System.out.println("Introduzca el dinero para el café con leche");
						dinero = Double.parseDouble(teclado.nextLine());
						double vuelta = m1.servirCafeConLeche(dinero);
						System.out.println("Su vuelta es " + vuelta);
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case'4':
					m1.llenarDepositos();
					System.out.println("Depósitos completos");
					break;
				case'5':
					System.out.println(m1.toString());
					break;
				case'6':
					System.out.println("Adiós. Máquina over");
				default:
					System.out.println("Introduzca una opción válida");
			}
		}
	}

}