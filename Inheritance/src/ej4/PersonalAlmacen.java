package ej4;

public class PersonalAlmacen extends Empleado {
private int codigoParte;

public PersonalAlmacen() {
	super();
}

public PersonalAlmacen(String nombre, String nacimiento, String puesto, int categoria, double sueldo, int codigoParte) {
	super(nombre, nacimiento, puesto, categoria, sueldo);
	this.codigoParte = codigoParte;
}

public int getCodigoParte() {
	return codigoParte;
}

public void setCodigoParte(int codigoParte) {
	this.codigoParte = codigoParte;
}

@Override
public String toString() {
	return "PersonalAlmacen [codigoParte=" + codigoParte + ", toString()=" + super.toString() + "]";
}



}
