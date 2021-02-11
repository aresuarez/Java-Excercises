package ejerciciohoras;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora() {
		super();
	}

	public Hora(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		if (horas > 24 || horas < 0) {
		error("horas");} else
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos > 60 || minutos < 0) {
		error("minutos");} else
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos > 60 || segundos < 0) {
			error("segundos");} else
		this.segundos = segundos;
		
	}
	
	@Override
	public String toString() {
		return "Hora [horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + "]";
	}

	public void error(String valor) {
		System.out.printf("Error, %s errone@s.",valor);
	}
}
