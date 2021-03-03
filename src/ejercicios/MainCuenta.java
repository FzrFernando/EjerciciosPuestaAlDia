package ejercicios;

import java.util.Scanner;

public class MainCuenta {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cantidad;
		
		Cuenta c1 = new Cuenta (123456, 30.00);
		System.out.println(c1);
		
		char opc = ' ';
		while (opc !='4') {
			System.out.println("1.Hacer un reintegro.");
			System.out.println("2.Hacer un ingreso.");
			System.out.println("3.Consultar el saldo y el número de reintegros e ingresos realizados");
			System.out.println("4.Finalizar las operaciones");
			System.out.println("Introduce la opción");
			opc =teclado.nextLine().charAt(0);
			
			switch(opc) {
			case '1':
				System.out.println("Introduzca el dinero a retirar");
				cantidad = Double.parseDouble(teclado.nextLine());
				c1.reintegro(cantidad);
				System.out.println(c1.toString());
				break;
			case '2':
				System.out.println("Introduzca la cantidad a ingresar");
				cantidad = Double.parseDouble(teclado.nextLine());
				c1.ingreso(cantidad);
				System.out.println(c1.toString());
				break;
			case '3':
				c1.toString();
				break;
			case '4':
				System.out.println("Ha finalizado las operaciones");
				break;
			default:
				System.out.println("Introduzca una opción válida"); 
			}
		}
		
	}

}
