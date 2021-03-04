package ejercicios;

public class Cuenta {

	private int numeroCuenta;
    private double saldo=0.0;
    private int numReintegros=0;
    private int numIngresos=0;
    
	public Cuenta(int numeroCuenta) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.numIngresos = numIngresos;
		this.numReintegros = numReintegros;
	}

	public Cuenta(int numeroCuenta, double saldo) {
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
		Cuenta other = (Cuenta) obj;
		if (numeroCuenta != other.numeroCuenta)
			return false;
		return true;
	}
    
	public void ingreso (double cantidad) {
		saldo = saldo + cantidad;
		this.numIngresos++;
	}
    
	public void reintegro (double cantidad) throws Exception {
		if (cantidad > saldo) {
			throw new Exception("No puedes sacar más dinero de lo que tienes");
		}
		saldo = saldo - cantidad;
		this.numReintegros++;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", numReintegros=" + numReintegros
				+ ", numIngresos=" + numIngresos + "]";
	}
	
	
}
