package com.obrasartisticas;

import java.util.ArrayList;
import java.util.Scanner;

public class OCine extends Obra{
private ArrayList <Artista>interprete;
private String productora;

public OCine(String titulo, int year, String productora) {
	super(titulo,year);
	super.addArray();
	this.productora = productora;
	interprete = new ArrayList <Artista>();
	addArray();
}

public ArrayList<Artista> getInterprete() {
	return interprete;
}

public void setInterprete(ArrayList<Artista> interprete) {
	this.interprete = interprete;
}

public String getProductora() {
	return productora;
}

public void setProductora(String productora) {
	this.productora = productora;
}

@Override
public String toString() {
	return "OCine [interprete=" + interprete + ", productora=" + productora + "]";
}

public void addArray() {
	System.out.println("Inserta el numero de interpretes a anadir");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i = 0;
	while ( i < num) {
		System.out.println("Inserta el nombre:");
		String name = sc.next();
		System.out.println("Inserta la fecha de nacimiento: ");
		int fecha = sc.nextInt();
		Artista artista = new Artista(name,fecha);
		interprete.add(artista);
		i++;
	}
	sc.close();
}

@Override
public void mostrarObras() {
	System.out.println(super.toString()+ this.toString());	
}

}
