package ej5;

import java.util.Arrays;

public class Ventas {
private int codVenta = 0;
private Producto[] productos;

public Ventas() {
	super();
}

public Ventas(Producto[] productos) {
	super();
	this.productos = productos;
}

public Producto[] getProductos() {
	return productos;
}

public void setProductos(Producto[] productos) {
	this.productos = productos;
}

@Override
public String toString() {
	return "Ventas [Codigo de venta="+ codVenta +" productos=" + Arrays.toString(productos) + "]";
}

public void calcularTotal() {
double total = 0;
this.codVenta += 1; 
System.out.println("Codigo de venta: "+ this.codVenta);
for(int i = 0;i<this.productos.length;i++) {
	
	System.out.println(this.productos[i].toString());
	total += productos[i].getPrecio();
}
for(Producto pos: productos) {
	pos.toString();
}
System.out.printf("||El total de su compra es: %.2f. Gracias por su compra.||",total);
}

}