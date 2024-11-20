package FunctionalInterfaceTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing testing = () -> {
			System.out.println(" this s abstract method ");

		};

		testing.getValue();
		testing.getValues();

	}
}

@FunctionalInterface
interface Testing {
	List<Cargo> value = new ArrayList<>();

	public void getValue();

	public default void getValues() {

		List<String> cargoDescription = value.stream()
				.filter(e -> e.getDescription() != null && !e.getDescription().isEmpty()).map(e -> e.getDescription())
				.collect(Collectors.toList());
		value.add(new Cargo(null, cargoDescription.toString(), 0, 0));
		System.out.println(" This is default values" + cargoDescription);

	}

}
