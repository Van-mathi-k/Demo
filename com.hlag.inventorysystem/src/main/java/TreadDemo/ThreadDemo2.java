package TreadDemo;

import java.util.stream.IntStream;

public class ThreadDemo2 {

	public static void main(String[] args) {

		Runnable runnable = () -> {

			IntStream.range(1, 10).forEach((e) -> {
				try {

					Thread.sleep(1000);
					System.out.println(e + Thread.currentThread().getName());
				} catch (InterruptedException e1) {
					// TODO: handle exception

					e1.printStackTrace();
				}
			});
		};

		Thread thread = new Thread(runnable);
		thread.start();

		thread.setPriority(10);
		Thread thread2 = new Thread(runnable);
		thread2.start();
		thread2.setPriority(5);
		try {
			thread2.join();

		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Thread thread3 = new Thread(runnable);
		thread3.setPriority(3);
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		thread3.start();

//		thread.start();
		thread.getAllStackTraces().forEach((k, v) -> {
			System.out.println(k);

			if ("main".equals(k.getThreadGroup().getName())) {
				System.out.println(k);
			}
		}

		);

	}

}