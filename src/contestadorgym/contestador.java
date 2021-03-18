package contestadorgym;

public class contestador {
	private String mensaje1;
	private String mensaje2;
	private String mensaje3;
	
	public contestador() {
		super();
		this.mensaje1 = "";
		this.mensaje2 = "";
		this.mensaje3 = "";
	}

	public String getMensaje1() throws Exception {
		if (!this.mensaje1.equals("")) {
			return mensaje1;
		}
		throw new Exception ("El mensaje 1 no existe");

	}

	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}

	public String getMensaje2() throws Exception {
		if (!this.mensaje2.equals("")) {
			return mensaje2;
		}
		throw new Exception ("El mensaje 2 no existe");
	}

	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}

	public String getMensaje3() throws Exception{
		if (!this.mensaje3.equals("")) {
			return mensaje3;
		}
		throw new Exception ("El mensaje 3 no existe");
	}

	public void setMensaje3(String mensaje3) {
		this.mensaje3 = mensaje3;
	}
	
	public void borrarMensaje1() {
		this.mensaje1 = "";
	}
	
	public void borrarMensaje2() {
		this.mensaje2 = "";
	}
	
	public void borrarMensaje3() {
		this.mensaje3 = "";
	}
	
	public void anadirMensaje(String texto) throws Exception {
		if (this.getMensaje1().equals("")) {
			this.setMensaje1(texto);
		}
		else if (this.getMensaje2().equals("")) {
			this.setMensaje2(texto);
			
		}
		else if (this.getMensaje3().equals("")) {
			this.setMensaje3(texto);
		}
		else {
			throw new Exception ("“Buzón completo");
		}
	}
	
	public void borrarTodosLosMensajes() {
		this.setMensaje1("");
		this.setMensaje2("");
		this.setMensaje3("");
	}
	
	public int contarMensajes() throws Exception {
		int cont = 0;
		if (!this.getMensaje1().equals("")) {
			cont++;
		}
		if (!this.getMensaje2().equals("")) {
			cont++;
		}
		if (!this.getMensaje3().equals("")) {
			cont++;
		}
		return cont;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mensaje1 == null) ? 0 : mensaje1.hashCode());
		result = prime * result + ((mensaje2 == null) ? 0 : mensaje2.hashCode());
		result = prime * result + ((mensaje3 == null) ? 0 : mensaje3.hashCode());
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
		contestador other = (contestador) obj;
		if (mensaje1 == null) {
			if (other.mensaje1 != null)
				return false;
		} else if (!mensaje1.equals(other.mensaje1))
			return false;
		if (mensaje2 == null) {
			if (other.mensaje2 != null)
				return false;
		} else if (!mensaje2.equals(other.mensaje2))
			return false;
		if (mensaje3 == null) {
			if (other.mensaje3 != null)
				return false;
		} else if (!mensaje3.equals(other.mensaje3))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "contestador [mensaje1=" + mensaje1 + ", mensaje2=" + mensaje2 + ", mensaje3=" + mensaje3 + "]";
	}
	
	
}
