
//import scanner!!
import java.util.Scanner;

public class WordLines {
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner scan = new Scanner(System.in);

		// print out Enter phrase and ask you to type in that phrase
		System.out.println("Enter phrase: ");

		// enter phrase and it will scan that and output the next code on the line
		String initialText = scan.nextLine();
		// place holder
		String finialText = "";
		// starting number for letter count
		int finialNum = 0;

		// for every thing inside the initial text...
		for (int i = 0; i < initialText.length(); i++) {
			// creating a simple data thing that will add
			char c = initialText.charAt(i);

			// ...if a character in the initialText string equals/is
			// a space then ...
			if (initialText.substring(i, i + 1).equals(" ")) {

				// ... enter new line
				finialText += "\n";

				// if its not a space then...
			} else {

				// ... it should print out letters
				finialText += initialText.substring(i, i + 1);
				// add a number to finialNum count
				finialNum++;

			}

		}
		System.out.println(finialText);
		System.out.println("Your input has " + finialNum + " non-blank characters");

	}

}
