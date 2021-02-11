package islasfilipinas;

public class Main {

	public static void main(String[] args) {
		
		Alumno xiang = new Alumno(1234,"Xiang","Zhou");
		
		System.out.println(xiang.toString());
		
		Alumno sarto = new Alumno(2353,"Sar","Torius");
		
		System.out.println(sarto.toString());
		
		Alumno fercho = new Alumno(5566,"Fer","Cho");
		
		System.out.println(fercho.toString());
		
		Alumno ester = new Alumno();
		
		//Printing object
		System.out.println(xiang.toString());
		//getting fields
		System.out.println(xiang.getNombre()+"\n"+sarto.getNombre()+"\n"+fercho.getNombre());
		//setting fields
		ester.setnExp(4852);
		ester.setNombre("Ester");
		ester.setApellido("Perez");
		
		System.out.println(ester.toString());
	}

}
