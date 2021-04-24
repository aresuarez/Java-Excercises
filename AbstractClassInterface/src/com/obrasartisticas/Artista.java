package com.obrasartisticas;

public class Artista {
private String nombre;
private int fecha;

public Artista(String nombre, int fecha) {
	this.nombre = nombre;
	this.fecha = fecha;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getFecha() {
	return fecha;
}

public void setFecha(int fecha) {
	this.fecha = fecha;
}

@Override
public String toString() {
	return " nombre=" + nombre + ", fecha=" + fecha ;
}



}
