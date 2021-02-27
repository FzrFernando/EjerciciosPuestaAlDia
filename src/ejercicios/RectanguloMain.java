package ejercicios;

import java.util.Scanner;

public class RectanguloMain {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo();
		
		System.out.println("Dime la longitud del rectángulo");
		r1.setLongitud(4);
		System.out.println("Dime el ancho del rectángulo");
		r1.setAncho(6);
		System.out.println(r1);
		
		
	}

}
