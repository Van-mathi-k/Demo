package FunctionalInterfaceTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiAction {

	public static void main(String[] args) {
		
		StreamActions action = () ->
		{
			System.out.println("find performance");
		};
		action.getPerformance();
		System.out.println(" get value of" + action.getPerformance());
		List<Cargo> filteredCargos = action.getPerformance();
		System.out.println("Filtered and sorted cargos:");
		filteredCargos.forEach(System.out::println);
	}

	@FunctionalInterface
	interface StreamActions {

		public void findPerformance();

		List<Cargo> cargos = Arrays.asList(new Cargo("HLTC-72", "petrol", 30, 90),
				new Cargo("HLTC-73", "cottons", 53, 99), new Cargo("HLTC-71", "Acessories", 55, 9),
				new Cargo("HLTC-70", "gatgets", 20, 9));
		public default List<Cargo> getPerformance()
		{
			return cargos.stream().filter(e -> e.getWeight() > 50 && (e.getDistance() == 9))
					.sorted((a, b) -> Integer.compare(a.getWeight(), b.getWeight())).collect(Collectors.toList());

			
			
		}

		default List<Cargo> getPerformance1() {
			return cargos.stream().filter(cargo -> cargo.calculateShippingCost() > 100 && cargo.getWeight() > 50)
					.sorted(Comparator.comparingInt(Cargo::getWeight)).collect(Collectors.toList());
		}

	}


}
