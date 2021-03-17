package nbinarios;

public class binarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binario = "1011";
		
		System.out.println(calcularBinario(binario));
	}
	
	public static int calcularBinario(String binario) {
		StringBuilder numero = new StringBuilder(binario); /*Creamos un StringBuilder para que podamos hacer el reverse*/
		numero.reverse();/*Le damos la vuelta para poder realizar la operación*/
		int cont = 0; /*Creamos un contador para que poder ir sumando y formar nuestro número*/
		
		for(int i=0; i < numero.length(); i++) { /*Aquí el for lo hacemos para que vaya mirando la cadena hasta el final */
			if (numero.charAt(i) == '1') { /*El if se utiliza para que cuando sea 1 poder hacer lo siguiente*/
				cont = (int) (cont + Math.pow(2,i));/*Aquí lo que hacemos es que el contador vaya sumandose con el 2 elevado a i que es la posición que ocupa*/ 
			}
		}
		return cont;/*Devolvemos el contador*/
		
	}

}
//int result = 0;
//
//for (int i=0; i<numero.length();i++) {
//	result = result + Integer.parseInt(String.valueOf(numero.charAt(i)));
//}
//return result;