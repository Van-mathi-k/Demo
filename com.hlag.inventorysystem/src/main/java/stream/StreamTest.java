package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "baana", "vanmathik", "cherryApple");
		Long startTime = System.currentTimeMillis();

		List<String> result = words.stream().filter(e -> e.length() > 5).map(e -> e.toUpperCase())
				.collect(Collectors.toList());

		result.stream().forEach(e -> System.out.println(e)); // any manipulation we are going to stream
		result.forEach(e -> System.out.println(e)); // only travesal purpose no more manipulation
		Long endTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println(endTime);
//		System.out.println(result);
		System.out.println("Diifernce" + (startTime - endTime));

	}

}