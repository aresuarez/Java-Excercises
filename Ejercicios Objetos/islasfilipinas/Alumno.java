package islasfilipinas;

public class Alumno {
	
	private int nExp;
	private String nombre;
	private String apellido;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int nExp, String nombre, String apellido) {
		super();
		this.nExp = nExp;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getnExp() {
		return nExp;
	}

	public void setnExp(int nExp) {
		this.nExp = nExp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [nExp=" + nExp + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
