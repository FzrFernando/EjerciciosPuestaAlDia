package ejercicios;

public class Maquina {
	private static final int MAXIMOCAFE=50;
	private static final int MAXIMOLECHE=50;
	private static final int MAXIMOVASOS=80;
	private static final double PRECIOCAFE=1.0;
	private static final double PRECIOLECHE=0.8;
	private static final double PRECIOCAFECONLECHE=1.5;
	private int depositoCafe;
	private int depositoLeche;
	private int depositoVasos;
	private double monedero;
	
	public Maquina(double monedero) {
		super();
		this.monedero = monedero;
		this.depositoCafe = this.MAXIMOCAFE;
		this.depositoLeche = this.MAXIMOLECHE;
		this.depositoVasos = this.MAXIMOVASOS;
	}
	
	public void llenarDeposito() {
		this.depositoCafe = this.MAXIMOCAFE;
		this.depositoLeche = this.MAXIMOLECHE;
		this.depositoVasos = this.MAXIMOVASOS;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	public int getDepositocafe() {
		return depositoCafe;
	}

	public int getDepositoleche() {
		return depositoLeche;
	}

	public int getDepositovasos() {
		return depositoVasos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depositoCafe;
		result = prime * result + depositoLeche;
		result = prime * result + depositoVasos;
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
		if (depositoCafe != other.depositoCafe)
			return false;
		if (depositoLeche != other.depositoLeche)
			return false;
		if (depositoVasos != other.depositoVasos)
			return false;
		if (Double.doubleToLongBits(monedero) != Double.doubleToLongBits(other.monedero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Maquina [depositocafe=" + depositoCafe + ", depositoleche=" + depositoLeche + ", depositovasos="
				+ depositoVasos + ", monedero=" + monedero + "]";
	}
	
	public double servirCafe(double dinero) throws Exception {
		if (dinero < PRECIOCAFE) {
			throw new Exception("Dinero insuficiente");	
		}
		else if ((dinero - PRECIOCAFE) > monedero) {
			throw new Exception("No hay dinero para devolver");
		}
		else if (this.depositoCafe ==0) {
			throw new Exception("No hay café");
		}
		else if (this.depositoVasos==0) {
			throw new Exception("No hay vasos");
		}
		else {
			this.monedero = this.monedero + this.PRECIOCAFE;
			this.depositoCafe--;
			this.depositoVasos--;
			return dinero - this.PRECIOCAFE;
		}
	}
	
	public double servirLeche(double dinero) throws Exception {
		if (dinero < PRECIOLECHE) {
			throw new Exception("Dinero insuficiente");	
		}
		else if ((dinero - PRECIOLECHE) > monedero) {
			throw new Exception("No hay dinero para devolver");
		}
		else if (this.depositoLeche ==0) {
			throw new Exception("No hay leche");
		}
		else if (this.depositoVasos==0) {
			throw new Exception("No hay vasos");
		}
		else {
			this.monedero = this.monedero + this.PRECIOLECHE;
			this.depositoLeche--;
			this.depositoVasos--;
			return dinero - this.PRECIOLECHE;
		}
	}
	
	public double servirCafeConLeche(double dinero) throws Exception {
		if (dinero < PRECIOCAFECONLECHE) {
			throw new Exception("Dinero insuficiente");	
		}
		else if ((dinero - PRECIOCAFECONLECHE) > monedero) {
			throw new Exception("No hay dinero para devolver");
		}
		else if (this.depositoCafe ==0) {
			throw new Exception("No hay café");
		}
		else if (this.depositoLeche==0) {
			throw new Exception("No hay leche"); 
		}
		else if (this.depositoVasos==0) {
			throw new Exception("No hay vasos");
		}
		else {
			this.monedero = this.monedero + this.PRECIOCAFECONLECHE;
			this.depositoCafe--;
			this.depositoVasos--;
			this.depositoLeche--;
			return dinero - this.PRECIOCAFECONLECHE;
		}
	}
	
	public void llenarDepositos() {
		this.depositoCafe = this.MAXIMOCAFE;
		this.depositoLeche = this.MAXIMOLECHE;
		this.depositoVasos = this.MAXIMOVASOS;
	}
}
