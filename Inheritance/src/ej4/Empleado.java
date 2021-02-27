package ej4;

public class Empleado {
	private String nombre;
	private String nacimiento;
	private String puesto;
	private int categoria;
	private double sueldo;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String nacimiento, String puesto, int categoria, double sueldo) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.puesto = puesto;
		this.categoria = categoria;
		this.sueldo = sueldo;
		calculoSueldo();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void calculoSueldo() {
		switch (categoria) {
		case 1: sueldo*=1.2*0.95;
		break;
		case 2: sueldo*=1.15*0.97;
		break;
		case 3: sueldo*=1.1*0.98;
		break;
		case 4: sueldo*=1.05*0.99;
		break;
		default: System.out.println("La categoria no es valida, elige una categoria del 1 al 4.");
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nacimiento=" + nacimiento + ", puesto=" + puesto + ", categoria="
				+ categoria + ", sueldo=" + sueldo + "]";
	}
	
	
}
