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
		
		
	}

}
