package padraoprojeto.aula07.iterator.aula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorExample1 {
	public static void main(String[] args) {
		List<String> arrlist = new ArrayList<>();
		arrlist.add("d");
		arrlist.add("dd");
		arrlist.add("ddd");
		arrlist.add("dddd");
		arrlist.add("ddddd");
		System.out.println(arrlist); // [d, dd, ddd, dddd, ddddd]

		Iterator<String> iterator = arrlist.iterator();
		while (iterator.hasNext()) {
			String i = iterator.next();
			System.out.println(i);
		}
	}

}
