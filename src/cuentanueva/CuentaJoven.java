package cuentanueva;

public class CuentaJoven extends Cuenta {
	
	public CuentaJoven(String titular, int numeroCuenta, double saldo, int bonificacion, int edad) throws Exception {
		super(numeroCuenta, saldo);
		this.titular = titular;
		this.bonificacion = bonificacion;
		this.edad = edad;
		if (esTitularValido() == false) {
			throw new Exception("No es un titular válido");
		}
	}

	private String titular;
	private int bonificacion;
	private int edad;
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getBonificacion() {
		return bonificacion;
	}
	
	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean esTitularValido() {
		if (getEdad() > 18 && getEdad() < 25) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void reintegro(double cantidad) throws Exception {
		if (esTitularValido()) {
			super.reintegro(cantidad);
		}
		else {
			throw new Exception("No es un titular válido");
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((titular == null) ? 0 : titular.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaJoven other = (CuentaJoven) obj;
		if (titular == null) {
			if (other.titular != null)
				return false;
		} else if (!titular.equals(other.titular))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CuentaJoven: titular: " + titular + " bonificación= " + (super.getSaldo() + (super.getSaldo()*(bonificacion/100.0))) + " edad=" + edad;
	}
	
	

}
