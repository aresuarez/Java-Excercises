package ej2;

public class Empleado {
	
private String nombre;
private String dni;
private int edad;
private boolean casado;
private double salario;


public Empleado() {
	
}


public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
	super();
	this.nombre = nombre;
	this.dni = dni;
	this.edad = edad;
	this.casado = casado;
	this.salario = salario;
	System.out.println("Clasificacion "+ this.clasif(edad));
}

public String clasif(int edad) {
	if (edad<=21) {return "Principiante";}
	else if (edad>=22 && edad<=35) {return "Intermedio";}
	else return "Senior";
}

public void aumentar(double percent) {
	salario += (salario*(percent/100));
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDni() {
	return dni;
}


public void setDni(String dni) {
	this.dni = dni;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public boolean isCasado() {
	return casado;
}


public void setCasado(boolean casado) {
	this.casado = casado;
}


public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}


@Override
public String toString() {
	return "Empleado \n nombre=" + nombre + "\n dni=" + dni + "\n edad=" + edad + "\n casado=" + casado + "\n salario="
			+ salario + "\n";
}

}
