package com.alejandro;

public class Mountainbike extends Bicicleta { 
	 
	public int alturaSillin; 

	public Mountainbike(int alturaInicial, int velocidadInicial, int marchaInicial) { 
		super(velocidadInicial, marchaInicial); 
		alturaSillin = alturaInicial; 
	} 
	 
	public void setAltura(int nuevoValor) { 
		alturaSillin = nuevoValor; 
	} 

}
