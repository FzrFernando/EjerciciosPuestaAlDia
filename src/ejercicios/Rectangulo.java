package ejercicios;

public class Rectangulo {

	private double longitud;
	private double ancho;
	
	public Rectangulo(double longitud, double ancho) {
		super();
		this.setLongitud(longitud);;
		this.setAncho(ancho);
	}

	public Rectangulo() {
		super();
		this.longitud = 1.0;
		this.ancho = 1.0;
	}

	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		if ((longitud > 0) && (longitud < 20)) {
			this.longitud = longitud;
		}
		else {
			this.longitud = 1;
		}
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		if ((ancho > 0 && ancho < 20)) {
			this.ancho = ancho;
		}
		else {
			this.ancho = 1;
		}
	}
	
	public double calcularPerimetro () {
		return ((this.longitud + this.ancho) * 2);
	}
	
	public double calcularArea () {
		return (this.longitud * this.ancho);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ancho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
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
		Rectangulo other = (Rectangulo) obj;
		if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + ", área=" + calcularArea() + ", perímetro=" + calcularPerimetro() +"]";
	}

	

	
}
