package ejercicios;

public class Rectangulo {

	private double longitud = 1.0;
	private double ancho = 1.0;
	
	public Rectangulo(int longitud, int ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}

	public double getLongitud() {
		return longitud;
	}
	
	public boolean setLongitud(int longitud) {
		this.longitud = longitud;
		if (longitud > 0 && longitud < 20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public boolean setAncho(int ancho) {
		this.ancho = ancho;
		if (ancho > 0 && ancho < 20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calcularPerimetro (int longitud, int ancho) {
		double perimetro;
		perimetro = this.longitud *2 + this.ancho*2;
		return perimetro;
	}
	
	public double calcularArea (int longitud, int ancho) {
		double area;
		area = this.longitud * this.ancho;
		return area;
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
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}

	
}
