package peliculas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		director.setNombre("Xiang");
		director.setPaisOrigen("Spain");
		director.setYearBorn(1996);
		Pelicula movie1 = new Pelicula();
		movie1.setDirector(director);
		movie1.setTitle("Jurassic Park");
		movie1.setYear(2016);
		Director director2 = new Director();
		Pelicula movie2 = new Pelicula();
		director2.setNombre("Juancho");
		director2.setPaisOrigen("Spain");
		director2.setYearBorn(1996);
		movie2.setDirector(director2);
		movie2.setTitle("King Kong");
		movie2.setYear(2010);
		//No es necesario llamar al metodo toString en caso de que ya este implementado en la clase. Se le puede llamar solo con Syso print.
		System.out.println(movie1);
		System.out.println(movie2.toString());
	}

}
