package librarypack;

import java.util.ArrayList;

public class Biblioteca {
	private int librosTotal;
	private ArrayList <Libro> libros;
	private int cont;
	
	public Biblioteca(int n){
	libros = new ArrayList<Libro>();
	this.librosTotal = n;
	this.cont = 0;
	}
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
		this.librosTotal = 10;
		this.cont = 0;
	}
	
	public Biblioteca(int librosTotal, ArrayList<Libro> libros, int cont) {
		super();
		this.librosTotal = librosTotal;
		this.libros = libros;
		this.cont = cont;
	}
	
	public int getLibrosTotal() {
		return librosTotal;
	}
	public void setLibrosTotal(int librosTotal) {
		this.librosTotal = librosTotal;
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public int getcont() {
		return cont;
	}
	public void setcont(int cont) {
		this.cont = cont;
	}
	
	public boolean equals(Biblioteca biblioteca){
		int num = 0;
		for (int i = 0; i<biblioteca.libros.size();i++) {
			for (int j = 0; i<biblioteca.libros.size();i++ ) {
				if (biblioteca.libros.get(i).equals(libros.get(j+1))) { 
					num++;
				}
			} 
		}
		return (num>0);
	}
	
	@Override
	public String toString() {
		return "Biblioteca [librosTotal=" + librosTotal + ", libros=" + libros + ", cont=" + cont + "]";
	}
	
	public boolean buscar(long ISBN) {
		for (int i = 0; i<libros.size();i++) {
			if (ISBN == libros.get(i).getISBN()){
				System.out.println("El libro con este ISBN ya esta en la biblioteca.");
				System.out.printf("Posicion, %d",this.buscarPos(ISBN));
				return true;}
			}
		System.out.println("El libro con este ISBN no esta en la biblioteca.");
		return false;
		}
		
		/* Dado un ISBN de un libro, devuelve la posici�n donde est�
	dentro del array, si no -1*/
	//GOOD
	private int buscarPos(long ISBN){
		int j = -1;
		int found = -1;
	for (int i = 0; i < libros.size(); i++){
		if (ISBN == libros.get(i).getISBN()){
		found = i;}}
		if (found != -1) {
			return found;
		} else
		return j;
		}
	
	public boolean insertar(Libro libro){
		int check = buscarPos(libro.getISBN());
		if (check >= 0) {
			System.out.println("Ya hay otro libro igual");
			return false;
		} else if (cont>9) {
			System.out.println("No hay espacio en la biblioteca.");
			return false;
		}
		else { 
			libros.add(libro);
			System.out.printf("Libro insertado correctamente, hay %d libros en la biblioteca.",libros.size());
			return true;
		}
	}
	
	//GOOD
	public boolean eliminar(long ISBN){
		int i = this.buscarPos(ISBN);
		if (i >= 0) {libros.remove(i);
			System.out.println("Libro eliminado.");
			return true;}
		else { 
				System.out.println("Libro no encontrado.");
				return false;}
		}
	
	public void mostrar() {
		for(Libro pos: libros) {
			System.out.println(pos.toString());
		}
		if (libros.size() == 0) {
			System.out.println("La agenda esta vacia.");
		}
	}
	}
