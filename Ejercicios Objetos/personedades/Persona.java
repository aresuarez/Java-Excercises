package personedades;

public class Persona {
	
	private String nombre;
	private String direccion;
	private int edad;
	
	public Persona() {
		super();
		nombre = "";
		direccion = "";
		edad = 0;
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String direccion, int edad) {
		//super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
	public void mayordeEdad() {
	if (this.edad>18) {
		System.out.println("MAYOR DE EDAD");
		}else 
		System.out.println("MENOR DE EDAD");
		}
		
	public String esMayorEdad()
	{  String menor = "MENOR DE EDAD";
		String mayor = "MAYOR DE EDAD";
		if (this.edad > 18) {
			return mayor;
			} else 	
			return menor;
	 }
	
	public void cualMayor(Persona persona)
	{
		if (this.edad > persona.getEdad()) {
			System.out.println("Esta persona es mayor que " + persona);
		} else {System.out.println("Esta persona es menor que "+ persona);}
}}


