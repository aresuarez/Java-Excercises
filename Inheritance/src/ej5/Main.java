package ej5;

public class Main {

	public static void main(String[] args) {
		Producto[] lista = new Producto[4];
		lista[0] = new ProductoAlimentacion(3.5,"Pizza",12312,"04-2021");
		lista[1] = new ProductoRopa(30,"Pijama",23123,"Algodon");
		lista[2] = new ProductoElectronico(50,"Reproductor mp3", 123123, 8.5);
		lista[3] = new ProductoAlimentacion(8,"Agua Carisima",121231,"04-2999");
		Ventas venta = new Ventas(lista);
		venta.calcularTotal();
	}

}