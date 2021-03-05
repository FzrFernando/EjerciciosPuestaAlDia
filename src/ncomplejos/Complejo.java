package ncomplejos;

public class Complejo {

	private double parteReal;
	private double parteImaginaria;
	
	public Complejo(double parteReal, double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public Complejo suma(Complejo c1) {
		double x = c1.parteReal + this.parteReal;
		double y = c1.parteImaginaria + this.parteImaginaria;
		Complejo resultado = new Complejo(x,y);
		return resultado;
	}
	
	public Complejo resta(Complejo c1) {
		double x = this.parteReal - c1.parteReal;
		double y = this.parteImaginaria - c1.parteImaginaria;
		Complejo resultado = new Complejo(x,y);
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(parteImaginaria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(parteReal);
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
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(parteImaginaria) != Double.doubleToLongBits(other.parteImaginaria))
			return false;
		if (Double.doubleToLongBits(parteReal) != Double.doubleToLongBits(other.parteReal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + parteReal + "," + parteImaginaria + "i" + ")";
	} 
	
}
