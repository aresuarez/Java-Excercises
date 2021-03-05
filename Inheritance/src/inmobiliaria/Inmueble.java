package inmobiliaria;

public class Inmueble {
private String location;
private double metrosCuadrado;

public Inmueble() {
	super();
}
public Inmueble(String location, double metrosCuadrado) {
	super();
	this.location = location;
	this.metrosCuadrado = metrosCuadrado;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getMetrosCuadrado() {
	return metrosCuadrado;
}
public void setMetrosCuadrado(double metrosCuadrado) {
	this.metrosCuadrado = metrosCuadrado;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	long temp;
	temp = Double.doubleToLongBits(metrosCuadrado);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Inmueble other = (Inmueble) obj;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (Double.doubleToLongBits(metrosCuadrado) != Double.doubleToLongBits(other.metrosCuadrado))
		return false;
	return true;
}

@Override
public String toString() {
	return "Inmueble [location=" + location + ", metrosCuadrado=" + metrosCuadrado + "]";
}


}
