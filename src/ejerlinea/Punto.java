package ejerlinea;

public class Punto {

	double ejeY;
	double ejeX;
	
	public Punto(double ejeY, double ejeX) {
		super();
		this.ejeY = ejeY;
		this.ejeX = ejeX;
	}

	public Punto() {
		super();
		this.ejeX=(0.0);
		this.ejeY=(0.0);
	}

	public double getEjeY() {
		return ejeY;
	}

	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}

	public double getEjeX() {
		return ejeX;
	}

	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ejeX);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ejeY);
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
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(ejeX) != Double.doubleToLongBits(other.ejeX))
			return false;
		if (Double.doubleToLongBits(ejeY) != Double.doubleToLongBits(other.ejeY))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + ejeX + "," + ejeY + ")";
	}
	
}
