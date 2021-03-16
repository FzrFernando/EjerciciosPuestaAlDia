package nbinarios;

public class binarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String binario = "1011";
		
		System.out.println(calcularBinario(binario));
	}
	
	public static int calcularBinario(String binario) {
		StringBuilder numero = new StringBuilder(binario);
		numero.reverse();
		int result = 0;
		
		for (int i=0; i<numero.length();i++) {
			result = result + Integer.parseInt(String.valueOf(numero.charAt(i)));
		}
		return result;
	}

}
