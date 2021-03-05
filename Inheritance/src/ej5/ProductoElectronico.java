package ej5;

public class ProductoElectronico extends Producto {
private double plus;

public ProductoElectronico(double plus) {
	super();
	this.plus = plus;
	precioTotal();
}

public ProductoElectronico(double precio, String nombre, int codigoBarra, double plus) {
	super(precio, nombre, codigoBarra);
	this.plus = plus;
	precioTotal();
}

public double getPlus() {
	return plus;
}

public void setPlus(double plus) {
	this.plus = plus;
}

@Override
public String toString() {
	return "ProductoElectronico [plus=" + plus + " " + super.toString() + "]";
}

public void precioTotal() {
	super.precio = super.getPrecio() + this.plus;
}



}
