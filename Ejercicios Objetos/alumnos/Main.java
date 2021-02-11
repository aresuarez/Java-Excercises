package alumnos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno("Xiang",10);
		Alumno alumno2 = new Alumno("Sara",10);
		Alumno alumno3 = new Alumno("Paco",5.5);
		Alumno alumno4 = new Alumno("Juan",6.5);
		Alumno alumno5 = new Alumno();
		
		double media = (alumno1.getNo() + alumno2.getNo() + alumno3.getNo() + alumno4.getNo() + alumno5.getNo())/5;
		System.out.println(media);
	}
}
