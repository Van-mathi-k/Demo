package FunctionalInterfaceTask;

public class StringMethods {

	public static void main(String[] args) {

		String userInput = "   Hello World!  \nThis is a test.  \n  ";
		System.out.println(userInput);
		if (userInput.isEmpty()) {
			System.out.println("The string is blank (contains only spaces or is empty).");
		}
//		String strippedString =userInput.strip();

}
}