package ejerlinea;

import java.util.Scanner;

public class LineaMain {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ejeX, ejeY;
		double cant;
		
		System.out.println("Dime el ejeX del primer punto");
		ejeX = Double.parseDouble(teclado.nextLine());
		System.out.println("Dime el ejeY del primer punto");
		ejeY = Double.parseDouble(teclado.nextLine());
		
		Punto p1 = new Punto(ejeX,ejeY);
		
		System.out.println("Dime el ejeX del segundo punto");
		ejeX = Double.parseDouble(teclado.nextLine());
		System.out.println("Dime el ejeY del segundo punto");
		ejeY = Double.parseDouble(teclado.nextLine());
		
		Punto p2 = new Punto(ejeX,ejeY);
		
		Linea l1 = new Linea(p1,p2);
		
		char opc=' ';
		while (opc != '3') {
			System.out.println("1.- ¿Hacia dónde te quieres desplazar?(A-Arriba, B-ABajo, I-Izquierda, D-Derecha)");
			System.out.println("2.- Mostrar línea");
			System.out.println("3.- Salir");
			System.out.println("Introduce la opción");
			opc =teclado.nextLine().charAt(0);
			
			switch (opc) {
			case '1':
				System.out.println("Elige un movimiento (A-Arriba, B-ABajo, I-Izquierda, D-Derecha)");
				char movimiento = teclado.nextLine().charAt(0);
				switch (movimiento) {
				case 'A':
					System.out.println("Introduce cuantas posiciones quieres moverte");
					cant = Double.parseDouble(teclado.nextLine());
					l1.moverArriba(cant);
					System.out.println("Se ha movido " + cant + " posiciones hacia arriba");
					break;
				case 'B':
					System.out.println("Introduce cuantas posiciones quieres moverte");
					cant = Double.parseDouble(teclado.nextLine());
					l1.moverAbajo(cant);
					System.out.println("Se ha movido " + cant + " posiciones hacia abajo");
					break;
				case 'I':
					System.out.println("Introduce cuantas posiciones quieres moverte");
					cant = Double.parseDouble(teclado.nextLine());
					l1.moverIzquierda(cant);
					System.out.println("Se ha movido " + cant + " posiciones hacia la izquierda");
					break;
				case 'D':
					System.out.println("Introduce cuantas posiciones quieres moverte");
					cant = Double.parseDouble(teclado.nextLine());
					l1.moverDerecha(cant);
					System.out.println("Se ha movido " + cant + " posiciones hacia la derecha");
					break;
				}
				break;
			case '2':
				System.out.println(l1);
				break;
			case '3':
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Opción no permitida");
			}
		}
		
	}

}
