package viajeslargo;

public class Viaje {
	public double distancia;
	public double horas;
	
	public Viaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Viaje(double distancia, double horas) {
		super();
		this.distancia = distancia;
		this.horas = horas;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	//no usar return = operacion, guardar operacion en variable y luego devolverla
	public double calcularVelocidad(double distancia,double horas) {
		double velocidad =  distancia/horas;
		return velocidad;
	}
	
}
