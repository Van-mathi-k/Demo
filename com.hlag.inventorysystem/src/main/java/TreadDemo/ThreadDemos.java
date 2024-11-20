package TreadDemo;

import java.util.stream.IntStream;

public class ThreadDemos {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			IntStream.range(1, 10).forEach(System.out::println);
		};

		Thread thread = new Thread(runnable);
		thread.start();
		thread.getAllStackTraces().forEach((k, v) -> {
			System.out.println(k);

			if ("main".equals(k.getThreadGroup().getName())) {
				System.out.println(k);
			}
		}

		);

	}
}