package lab12;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names2 = new ArrayList<String>();
		names.add("Olivia");
		names.add("Emma");
		names.add("Ava");
		names.add("Charlotte");
		names.add("Sophia");
		System.out.println(names);
		names2.add("Noah");
		names2.add("Liam");
		names2.add("William");
		names2.add("Mason");
		names2.add("James");
		System.out.println(names2);
		names.addAll(names2);
		System.out.println(names);
		names.set(4, "Sophie");
		System.out.println(names);
		names.add(3,"Anne");
		System.out.println(names);
		System.out.println("Names list contains Liam? "+names.contains("Liam"));
		System.out.println("Names list contains Sam? "+names.contains("Sam"));
		names.remove(1);
		System.out.println(names);
		System.out.println("The length of the list: "+names.size());
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i)+" index number is "+i);
		}

	}

}
