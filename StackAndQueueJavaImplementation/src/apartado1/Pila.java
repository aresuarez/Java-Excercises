package apartado1;

import java.util.LinkedList;

public class Pila extends ColeccionSimple{
private LinkedList<Object> list;

public Pila() {
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
	Object a = list.get(list.size()-1);
	list.remove(list.size()-1);
	return a;
}

@Override
public Object primero() {
	System.out.println(list.size());
	return list.get(list.size()-1);
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
