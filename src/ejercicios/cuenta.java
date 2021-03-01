package ejercicios;

public class cuenta {

	private int numeroCuenta;
    private double saldo=0.0;
    private int numReintegros=0;
    private int numIngresos=0;
    
	public cuenta(int numeroCuenta) {
		super();
		this.numeroCuenta = numeroCuenta;
	}

	public cuenta(int numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumReintegros() {
		return numReintegros;
	}

	public int getNumIngresos() {
		return numIngresos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroCuenta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cuenta other = (cuenta) obj;
		if (numeroCuenta != other.numeroCuenta)
			return false;
		return true;
	}
    
	public void ingreso (double cantidad) {
		saldo = saldo + cantidad;
		this.numIngresos++;
	}
    
	public void reintegro (double cantidad) {
		saldo = saldo - cantidad;
		this.numReintegros++;
	}
}
