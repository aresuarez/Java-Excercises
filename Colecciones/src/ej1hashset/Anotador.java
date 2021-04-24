package ej1hashset;




public class Anotador {
	private String nombre;
	private int edad;
	private String nombreEquipo;
	private int numCanastasIntroducidas;
	private String ciudad;
	
	public Anotador() {
		
	}
	
	public Anotador(String nombre, int edad, String nombreEquipo, int numCanastasIntroducidas, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nombreEquipo = nombreEquipo;
		this.numCanastasIntroducidas = numCanastasIntroducidas;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getNumCanastasIntroducidas() {
		return numCanastasIntroducidas;
	}

	public void setNumCanastasIntroducidas(int numCanastasIntroducidas) {
		this.numCanastasIntroducidas = numCanastasIntroducidas;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	@Override
	public String toString() {
		return "Anotador [nombre=" + nombre + ", edad=" + edad + ", nombreEquipo=" + nombreEquipo
				+ ", numCanastasIntroducidas=" + numCanastasIntroducidas + ", ciudad=" + ciudad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreEquipo == null) ? 0 : nombreEquipo.hashCode());
		result = prime * result + numCanastasIntroducidas;
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
		Anotador other = (Anotador) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreEquipo == null) {
			if (other.nombreEquipo != null)
				return false;
		} else if (!nombreEquipo.equals(other.nombreEquipo))
			return false;
		if (numCanastasIntroducidas != other.numCanastasIntroducidas)
			return false;
		return true;
	}
	
	
	
	
}
