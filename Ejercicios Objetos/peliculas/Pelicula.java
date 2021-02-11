package peliculas;

public class Pelicula {
	private String title;
	private int year;
	private Director director;
	
	public Pelicula() {
		super();
		title = "undefined";
		year = 0;
		director = null;
	}

	public Pelicula(String title) {
		super();
		this.title = title;
	}

	public Pelicula(int year) {
		super();
		this.year = year;
	}

	public Pelicula(Director director) {
		super();
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [title=" + title + ", year=" + year + ", director=" + director + "]";
	}
	
	
	
}
