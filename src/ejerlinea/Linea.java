package ejerlinea;

public class Linea {

	private Punto puntoI;
	private Punto puntoF;
	
	public Linea(Punto puntoI, Punto puntoF) {
		super();
		this.puntoI = puntoI;
		this.puntoF = puntoF;
	}

	public Linea() {
		super();
		this.puntoI = new Punto ();
		this.puntoF = new Punto (0.0 , 0.0);
	}

	public Punto getPuntoI() {
		return puntoI;
	}

	public void setPuntoI(Punto puntoI) {
		this.puntoI = puntoI;
	}

	public Punto getPuntoF() {
		return puntoF;
	}

	public void setPuntoF(Punto puntoF) {
		this.puntoF = puntoF;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((puntoF == null) ? 0 : puntoF.hashCode());
		result = prime * result + ((puntoI == null) ? 0 : puntoI.hashCode());
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
		Linea other = (Linea) obj;
		if (puntoF == null) {
			if (other.puntoF != null)
				return false;
		} else if (!puntoF.equals(other.puntoF))
			return false;
		if (puntoI == null) {
			if (other.puntoI != null)
				return false;
		} else if (!puntoI.equals(other.puntoI))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + puntoI + "," + puntoF + "]";
	}
	
	public void moverDerecha(double cant) {
		this.puntoI.setEjeX(this.puntoI.getEjeX()+cant);
		this.puntoF.setEjeX(this.puntoF.getEjeX()+cant);
	}
	
	public void moverArriba(double cant) {
		this.puntoI.setEjeY(this.puntoI.getEjeY()+cant);
		this.puntoF.setEjeY(this.puntoF.getEjeY()+cant);
	}
	
	public void moverIzquierda(double cant) {
		this.puntoI.setEjeX(this.puntoI.getEjeX()-cant);
		this.puntoF.setEjeX(this.puntoF.getEjeX()-cant);
	}
	
	public void moverAbajo(double cant) {
		this.puntoI.setEjeY(this.puntoI.getEjeY()-cant);
		this.puntoF.setEjeY(this.puntoF.getEjeY()-cant);
	}
}
