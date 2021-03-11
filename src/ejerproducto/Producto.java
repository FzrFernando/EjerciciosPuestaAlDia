package ejerproducto;

public class Producto {

	private static final double IVA = 0.2;
	private int codigo = 0;
	private String descrip;
	private double precio;
	private static int codigosig = 1;
	
	public Producto(double precio, String descrip) {
		super();
		this.descrip = descrip;
		this.precio = precio;
		this.codigo = codigosig;
		codigosig++;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public double precioConIva() {
		return precio + precio * IVA;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descrip == null) ? 0 : descrip.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
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
		Producto other = (Producto) obj;
		if (codigo != other.codigo)
			return false;
		if (descrip == null) {
			if (other.descrip != null)
				return false;
		} else if (!descrip.equals(other.descrip))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descrip=" + descrip + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	
}
