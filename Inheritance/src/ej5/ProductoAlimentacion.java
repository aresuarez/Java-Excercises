package ej5;

public class ProductoAlimentacion extends Producto {
private String fechaCaducidad;


public ProductoAlimentacion(String fechaCaducidad) {
	super();
	this.fechaCaducidad = fechaCaducidad;
}

public ProductoAlimentacion(double precio, String nombre, int codigoBarra, String fechaCaducidad) {
	super(precio, nombre, codigoBarra);
	this.fechaCaducidad = fechaCaducidad;
}

public String getFechaCaducidad() {
	return fechaCaducidad;
}

public void setFechaCaducidad(String fechaCaducidad) {
	this.fechaCaducidad = fechaCaducidad;
}

@Override
public String toString() {
	return "ProductoAlimentacion [fechaCaducidad=" + fechaCaducidad +" "+ super.toString() + "]";
}





}
