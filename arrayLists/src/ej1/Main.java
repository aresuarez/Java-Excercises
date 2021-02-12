package ej1;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

public static void main(String[] args) {

	
ArrayList <String> array = new ArrayList <String>();
array.add("Aprendiendo");
array.add("a");
array.add("programar");
array.add("en");
array.add("Java");
array.add("con");
array.add("ArrayLists");

for (String pos: array) {
	System.out.println(pos);
}
System.out.println("-------------------------");
//Ej2 desde aqui.
int count = 0;
Iterator <String> it = array.iterator();
while (it.hasNext()) {
		if (count %2 == 0) {
		System.out.println(it.next());
		}else { it.next();} count++;
		}
}}
