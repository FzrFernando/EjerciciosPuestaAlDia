package contestadorgym;

import java.util.Scanner;

public class contestadorMain {

	static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		
		contestador c1 = new contestador();
		
		char opc = ' ';
		while (opc != '5') {
			System.out.println("1. Consultar número de mensajes");
			System.out.println("2. Consultar mensaje");
			System.out.println("3. Añadir mensaje");
			System.out.println("4. Borrar todos los mensajes");
			System.out.println("5. Salir");
			opc = teclado.nextLine().charAt(0);
			
			switch(opc) {
			case '1':
				try {
					c1.contarMensajes();
					break;
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			case '2':
				char msg = ' ';
				while (msg != '3') {
					System.out.println("1. Mensaje número 1");
					System.out.println("2. Mensaje número 2");
					System.out.println("3. Mensaje número 3");
					System.out.println("4. Salir");
					msg = teclado.nextLine().charAt(0);
					
					switch(msg) {
					case '1':
						char msg1 = ' ';
						//while (msg1 != '2') {
							System.out.println("1. Oír");
							System.out.println("2. Borrar");
							msg1 = teclado.nextLine().charAt(0);
							
							switch(msg1) {
							case '1':
								try {
									c1.getMensaje1();
									break;
								}
								catch (Exception e){
									System.out.println(e.getMessage());
								}
								break;
							case '2':
								c1.borrarMensaje1();
								break;
							}
						//}
						break;
					case '2':
						char msg2 = ' ';
						//while (msg2 != '2') {
							System.out.println("1. Oír");
							System.out.println("2. Borrar");
							msg2 = teclado.nextLine().charAt(0);
							
							switch(msg2) {
							case '1':
								try {
									c1.getMensaje2();
									
								}
								catch (Exception e){
									System.out.println(e.getMessage());
								}
								break;
							case '2':
								c1.borrarMensaje2();
								break;
							}
					//	}
							break;
					case '3':
						char msg3 = ' ';
						//while (msg3 != '3') {
							System.out.println("1. Oír");
							System.out.println("2. Borrar");
							//System.out.println("3. Salir");

							msg3 = teclado.nextLine().charAt(0);
							
							switch(msg3) {
							case '1':
								try {
									c1.getMensaje3();
									
								}
								catch (Exception e){
									System.out.println(e.getMessage());
								}
								break;
							case '2':
								c1.borrarMensaje3();
								break;
							}
						//}
						break;
					case '4':
						System.out.println("Has terminado de leer los mensajes");
					}
					break;
				}
				break;
			case '3':
				try {
					System.out.println("Añada el mensaje");
					texto = teclado.nextLine();
					c1.anadirMensaje(texto);
					break;
				}
				catch (Exception e){
					System.out.println(e.getMessage());
				}
				break;
			case '4':
				c1.borrarTodosLosMensajes();
				break;
			case '5':
				System.out.println("Has finalizado con el contestador");
				break;
			default:
				System.out.println("Introduzca una opción válida");
			}

		}
	}

}
