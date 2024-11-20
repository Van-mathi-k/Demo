package FunctionalInterfaceTask;

public class RefactorLegacyCodebase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread running using an anonymous class!");
			}

		});

		thread.start();

//	replace Anonymous class with lambda expression

		

	}

}
