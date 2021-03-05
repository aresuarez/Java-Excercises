package ej5;

public class Producto {
protected double precio;
private String nombre;
private int codigoBarra;

public Producto() {
	super();
}

public Producto(double precio, String nombre, int codigoBarra) {
	super();
	this.precio = precio;
	this.nombre = nombre;
	this.codigoBarra = codigoBarra;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCodigoBarra() {
	return codigoBarra;
}

public void setCodigoBarra(int codigoBarra) {
	this.codigoBarra = codigoBarra;
}

@Override
public String toString() {
	return "Producto [precio=" + precio + ", nombre=" + nombre + ", codigoBarra=" + codigoBarra + "]";
}

}
