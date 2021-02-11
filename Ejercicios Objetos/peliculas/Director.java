package peliculas;

public class Director {
 private String nombre;
 private String paisOrigen;
 private int yearBorn;
 
public Director() {
	super();
}

public Director(String nombre, String paisOrigen, int yearBorn) {
	super();
	this.nombre = nombre;
	this.paisOrigen = paisOrigen;
	this.yearBorn = yearBorn;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPaisOrigen() {
	return paisOrigen;
}
public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}
public int getYearBorn() {
	return yearBorn;
}
public void setYearBorn(int yearBorn) {
	this.yearBorn = yearBorn;
}
@Override
public String toString() {
	return "Director [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", yearBorn=" + yearBorn + "]";
}
 
 
}
