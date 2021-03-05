package inmobiliaria;

public class Construccion extends Inmueble{
private String estado;
private double precio;

public Construccion() {
	super();
}
public Construccion(String location, double metrosCuadrado, String estado, double precio) {
	super(location, metrosCuadrado);
	this.estado = estado;
	this.precio = precio;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}


}
