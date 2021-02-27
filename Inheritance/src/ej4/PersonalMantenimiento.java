package ej4;

import java.util.Arrays;

public class PersonalMantenimiento extends Empleado{
private String[] labores;
		
	public PersonalMantenimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalMantenimiento(String nombre, String nacimiento, String puesto, int categoria, double sueldo, String[] labores) {
		super(nombre, nacimiento, puesto, categoria, sueldo);
		this.labores=labores;
	}

	public String[] getLabores() {
		return labores;
	}

	public void setLabores(String[] labores) {
		this.labores = labores;
	}

	@Override
	public String toString() {
		return "PersonalMantenimiento [labores=" + Arrays.toString(labores) + ", toString()=" + super.toString() + "]";
	}

		
	
}
