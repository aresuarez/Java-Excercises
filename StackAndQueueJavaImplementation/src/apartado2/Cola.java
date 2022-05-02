package apartado2;

import java.util.LinkedList;

public class Cola extends ColeccionSimple{
	private LinkedList<Object> list;
	
	public Cola() {
		super();
		list = new LinkedList<Object>();
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	@Override
	public void rellenar(ColeccionSimple a) {
		Integer o;
		System.out.println("Metiendo en la cola.");
		System.out.println("---------");
		for(int i = 0; i<=9;i++) {
			o = i+1;
			list.add(i,o);
			System.out.println(list.get(i));
		}
		
	}

	@Override
	public void imprimirYVaciar(ColeccionSimple a) {
		System.out.println("Sacando de la cola.");
		System.out.println("---------");
		for(int i = 0; i<list.size();) {
			System.out.println(list.get(i));
			list.remove(i);
		}
		System.out.println("Cola vacía!:" + list);
	}
}
