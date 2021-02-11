package alumnos;

public class Alumno {
	private String alumno;
	private double no;
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(String alumno, double no) {
		super();
		this.alumno = alumno;
		this.no = no;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public double getNo() {
		return no;
	}
	public void setNo(double no) {
		this.no = no;
	}
	
}
