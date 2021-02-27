package ej1;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Operario [getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
