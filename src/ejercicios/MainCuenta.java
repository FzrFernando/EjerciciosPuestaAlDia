package ejercicios;

import java.util.Scanner;

public class MainCuenta {
	
	Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta (123456, 30.00);
		System.out.println(c1);
		
		char opc = ' ';
		while (opc !='4') {
			System.out.println("1.Hacer un reintegro, se pedirá la cantidad a retirar.");
			System.out.println("2.Hacer un ingreso, se pedirá la cantidad a ingresar.");
			System.out.println("3.Consultar el saldo y el número de reintegros e ingresos realizados");
			System.out.println("4.Finalizar las operaciones");
		}
		
	}

}
