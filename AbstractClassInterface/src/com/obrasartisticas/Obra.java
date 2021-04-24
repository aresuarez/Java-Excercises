package com.obrasartisticas;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Obra {
	private String titulo;
	private ArrayList <Artista> autor;
	private int year;
	
	
	
	public Obra(String titulo, int year) {
		super();
		this.titulo = titulo;
		this.autor = new ArrayList<Artista>();
		this.year = year;
	}



	public Obra() {
		super();
		
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public ArrayList<Artista> getAutor() {
		return autor;
	}



	public void setAutor(ArrayList<Artista> autor) {
		this.autor = autor;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Obra titulo=" + titulo + ", autor=" + autor + ", year=" + year + "  ";
	}

	public void addArray() {
		System.out.println("Inserta el numero de autores a anadir");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		while ( i < num) {
			System.out.println("Inserta el nombre:");
			String name = sc.next();
			System.out.println("Inserta la fecha de nacimiento: ");
			int fecha = sc.nextInt();
			autor.add(new Artista(name,fecha));
			i++;
		}
		sc.close();
	}

	public abstract void mostrarObras() ;
}
