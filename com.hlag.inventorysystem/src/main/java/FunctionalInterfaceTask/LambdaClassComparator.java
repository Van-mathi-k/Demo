package FunctionalInterfaceTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaClassComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

		System.out.println("Sorted names: " + names);
	}

}
