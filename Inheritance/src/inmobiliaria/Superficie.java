package inmobiliaria;

public class Superficie extends Inmueble {
private double precioM2;

public Superficie() {
	super();
}

public Superficie(String location, double metrosCuadrado, double precioM2) {
	super(location, metrosCuadrado);
	this.precioM2 = precioM2;
}

public double getPrecioM2() {
	return precioM2;
}

public void setPrecioM2(double precioM2) {
	this.precioM2 = precioM2;
}

public void precio(Superficie sup) {
	double total = sup.getPrecioM2()*super.getMetrosCuadrado();
	System.out.printf("El precio de esta superficie es de %.2f.",total);
}

@Override
public String toString() {
	return "Superficie [precioM2=" + precioM2 + ", toString()=" + super.toString() + "]";
}

}
