package com.obrasartisticas;

public class OLiteraria extends Obra{
private String editorial;
private int numPag;

public OLiteraria(String titulo, int year,String editorial, int numPag) {
	super(titulo,year);
	super.addArray();
	this.editorial = editorial;
	this.numPag = numPag;
}

public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public int getNumPag() {
	return numPag;
}
public void setNumPag(int numPag) {
	this.numPag = numPag;
}

@Override
public String toString() {
	return "OLiteraria [editorial=" + editorial + ", numPag=" + numPag + "]";
}

@Override
public void mostrarObras() {
	System.out.println(super.toString()+ this.toString());
	
}

}
