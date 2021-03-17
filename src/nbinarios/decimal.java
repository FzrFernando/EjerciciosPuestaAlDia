package nbinarios;

public class decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimal = 13;
		System.out.println(calcularDecimal(decimal));
	}

	public static String calcularDecimal(int decimal) {
		StringBuilder c1 = new StringBuilder(); /*Creamos un StringBuilder,que es donde iremos añadiendo los numeros binarios*/
		while (decimal >= 2) { /*Se crea un while para que vaya dividiendo el numero que le hemos introducido*/
			c1.append(decimal%2);/*Hacemos el c1.append para ir añadiendo el resto a c1 y que se vaya formando el numero binario*/
			decimal = decimal/2;/*Esto nos sirve para que siga diviendo el numero hasta que no pueda dividir más*/
		}
		c1.append(decimal);/*Aquí añadimos el último cociente que hemos hecho*/
		return c1.reverse().toString(); /* Aquí devolvemos el resultado que sería darle la vuelta a c1 y transformandolo a String*/
	}
}