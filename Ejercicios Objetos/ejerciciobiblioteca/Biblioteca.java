package ejerciciobiblioteca;

import java.util.Arrays;

public class Biblioteca {
	private int librosTotal;
	private Libro[] libros = new Libro[librosTotal];
	private int cont;
	
	public Biblioteca(int n){
	libros = new Libro[n];
	this.librosTotal = n;
	this.cont = 0;
	}
	public Biblioteca() {
		this.libros = new Libro[10];
		this.librosTotal = 10;
		this.cont = 0;
	}
	
	public Biblioteca(int librosTotal, Libro[] libros, int cont) {
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
	public Libro[] getLibro() {
		return libros;
	}
	public void setLibro(Libro[] libro) {
		this.libros = libro;
	}
	public int getcont() {
		return cont;
	}
	public void setcont(int cont) {
		this.cont = cont;
	}
	
	/* Devuelve TRUE si los libros de la biblioteca no son los
	mismos y FALSE en caso contrario. Tener en cuenta que
	tenemos GUARDADO LOS LIBROS en un array de libros.*/
	public boolean equals(Biblioteca biblioteca){
		int num = 0;
		for (int i = 0; i<biblioteca.libros.length;i++) {
			for (int j = 0; i<biblioteca.libros.length;i++ ) {
				if (libros[i].equals(libros[j+1])) {
					num++;
				} else { return false;}
			} 
		}
		return true;
	}
	
	@Override
	public String toString() {
		String ST = "";
	for (int i = 0; i<libros.length;i++) {
		ST = libros[i].toString();
		}
		return ST ;
	}
	
	/*Devuelve true si el libro está en la biblioteca
	Devuelve false si el libro no está en la biblioteca. Tener en
	cuenta los libros están en un array */
	
	public boolean buscar(long ISBN) {
		for (int i = 0; i<libros.length;i++) {
			if (ISBN == libros[i].getISBN()){
				System.out.println("El libro con este ISBN ya esta en la biblioteca.");
				return true;}
			}
		System.out.println("El libro con este ISBN no esta en la biblioteca.");
		return false;
		}
		
		/* Dado un ISBN de un libro, devuelve la posición donde está
	dentro del array, si no -1*/
	private int buscarPos(long ISBN){
		int j = -1;
	for (int i = 0; i < libros.length; i++){
		if (ISBN == libros[i].getISBN()){
		return i;}} 
		return j;
		}
	/*Si tengo espacio en la biblioteca y no hay otro libro
	 con ese mismo código isbn SE INSERTA el libro que viene
	dado por el parámetro libro. Se aconseja usar el método
	anterior BUSCARPOS */
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
			libros[cont] = libro;
			cont++;
			System.out.printf("Libro insertado correctamente, hay %d libros en la biblioteca.",cont);
			return true;
		}
	}
	

	//usar buscarpos
	public boolean eliminar(long ISBN){
		if (this.buscarPos(ISBN) <= 0) {
			int i = this.buscarPos(ISBN);
			libros[i] = null;
			System.out.println("Libro eliminado.");
			return true;
			}else 
				System.out.println("Libro no encontrado.");
				return false;
		}
	}
