package arrayej1;

public class Operario {
private String nombre;
private double sueldo;

public Operario() {
	super();
	// TODO Auto-generated constructor stub
}

public Operario(String nombre, double sueldo) {
	super();
	this.nombre = nombre;
	this.sueldo = sueldo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}

@Override
public String toString() {
	return "[nombre=" + nombre + ", sueldo=" + sueldo + "]";
}



}
