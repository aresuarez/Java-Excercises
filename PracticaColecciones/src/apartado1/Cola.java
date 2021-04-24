package apartado1;

import java.util.LinkedList;

public class Cola extends ColeccionSimple{
	private LinkedList<Object> list;
	
	public Cola() {
		super();
		this.list = new LinkedList<Object>();
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}
	
	@Override
	public boolean isEmpty() {
		if(list.size()==0)return true;
		else return false;
	}

	@Override
	public Object extraer() {
		Object a = list.get(0);
		list.remove(0);
		return a;
	}

	@Override
	public Object primero() {
		return list.get(0);
	}

	@Override
	public void add(Object o) {
		list.add(o);
	}

	@Override
	public String toStringo() {
		return list.toString();
	}
}
