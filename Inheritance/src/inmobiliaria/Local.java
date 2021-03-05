package inmobiliaria;

public class Local extends Construccion{
private double precioM2;

public Local() {
	super();
	// TODO Auto-generated constructor stub
}

public Local(String location, double metrosCuadrado, String estado, double precio, double precioM2) {
	super(location, metrosCuadrado, estado, precio);
	this.precioM2 = precioM2;
}

public double getPrecioM2() {
	return precioM2;
}

public void setPrecioM2(double precioM2) {
	this.precioM2 = precioM2;
}




}
