package inmobiliaria;

import java.util.Iterator;

public class PlazaGaraje extends Superficie{
private String pubPriv;

public PlazaGaraje() {
	super();
	// TODO Auto-generated constructor stub
}

public PlazaGaraje(String location, double metrosCuadrado, double precioM2, String pubPriv) {
	super(location, metrosCuadrado, precioM2);
	this.pubPriv=pubPriv;
}

public String getPubPriv() {
	return pubPriv;
}

public void setPubPriv(String pubPriv) {
	this.pubPriv = pubPriv;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((pubPriv == null) ? 0 : pubPriv.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	PlazaGaraje other = (PlazaGaraje) obj;
	if (pubPriv == null) {
		if (other.pubPriv != null)
			return false;
	} else if (!pubPriv.equals(other.pubPriv))
		return false;
	return true;
}

@Override
public String toString() {
	return "PlazaGaraje [pubPriv=" + pubPriv + ", toString()=" + super.toString() + "]";
}




}
