package inmobiliaria;

import java.util.Iterator;

public class Solar extends Superficie {
private String zona;

public Solar() {
	super();
}

public Solar(String location, double metrosCuadrado, double precioM2, String zona) {
	super(location, metrosCuadrado, precioM2);
	this.zona = zona;
}

public String getZona() {
	return zona;
}

public void setZona(String zona) {
	this.zona = zona;
}



}
