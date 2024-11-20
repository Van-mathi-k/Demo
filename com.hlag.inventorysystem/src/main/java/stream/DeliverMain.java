package stream;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeliverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Delivery> deliveries = Arrays.asList(new Delivery("D1", true, 1.5, 10.0, 50.0), // Completed
//				new Delivery("D2", false, 2.0, 15.0, 70.0), // Pending
//				new Delivery("D3", true, 1.0, 8.0, 40.0), // Completed
//				new Delivery("D4", true, 3.0, 20.0, 90.0), // Completed
//				new Delivery("D5", false, 0.5, 5.0, 20.0), // Pending
//				new Delivery("D6", true, 2.0, 12.0, 80.0)); // Completed

		// TODO Auto-generated method stub

		List<Integer> numbers = IntStream.range(1, 10_000_000).boxed().collect(Collectors.toList()); //
		Instant start = Instant.now();
		long sequentialSum = numbers.parallelStream().mapToLong(n -> (long) n * n).sum(); // millions of records when
																							// come wiil
																					// go parrlee
		Instant end = Instant.now();
		System.out.println(
				"Sequential Sum: " + sequentialSum + ", Time: " + (end.toEpochMilli() - start.toEpochMilli()) + "ms");

	}
}