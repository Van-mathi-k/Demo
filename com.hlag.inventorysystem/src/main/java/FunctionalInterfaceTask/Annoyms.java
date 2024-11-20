package FunctionalInterfaceTask;

public class Annoyms {

	public static void main(String[] args) {
		// TODO Auto-generated method stublass LambdaExampl {

		Thread thread = new Thread(() -> System.out.println("Thread running using a lambda!"));
		thread.start();
	}

}
