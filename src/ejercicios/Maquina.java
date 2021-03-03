package ejercicios;

public class Maquina {
	private static final int MAXIMOCAFE=50;
	private static final int MAXIMOLECHE=50;
	private static final int MAXIMOVASOS=80;
	private static final double PRECIOCAFE=1.0;
	private static final double PRECIOLECHE=0.8;
	private static final double PRECIOCAFECONLECHE=1.5;
	private int depositocafe;
	private int depositoleche;
	private int depositovasos;
	private double monedero;
	
	public Maquina(double monedero) {
		super();
		this.monedero = monedero;
		this.depositocafe = this.MAXIMOCAFE;
		this.depositoleche = this.MAXIMOLECHE;
		this.depositovasos = this.MAXIMOVASOS;
	}
	
	public void llenarDeposito() {
		this.depositocafe = this.MAXIMOCAFE;
		this.depositoleche = this.MAXIMOLECHE;
		this.depositovasos = this.MAXIMOVASOS;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	public int getDepositocafe() {
		return depositocafe;
	}

	public int getDepositoleche() {
		return depositoleche;
	}

	public int getDepositovasos() {
		return depositovasos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depositocafe;
		result = prime * result + depositoleche;
		result = prime * result + depositovasos;
		long temp;
		temp = Double.doubleToLongBits(monedero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Maquina other = (Maquina) obj;
		if (depositocafe != other.depositocafe)
			return false;
		if (depositoleche != other.depositoleche)
			return false;
		if (depositovasos != other.depositovasos)
			return false;
		if (Double.doubleToLongBits(monedero) != Double.doubleToLongBits(other.monedero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Maquina [depositocafe=" + depositocafe + ", depositoleche=" + depositoleche + ", depositovasos="
				+ depositovasos + ", monedero=" + monedero + "]";
	}
	
	
}
