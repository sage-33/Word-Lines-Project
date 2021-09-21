import java.util.Scanner; //import scanner!!

public class WordLines {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // Create a Scanner object

		System.out.println("Enter phrase: "); // print out Enter phrase and ask you to type in that phrase

		String initialText = scan.nextLine(); // enter phrase and it will scan that and output the next code on the line
		String finialText = ""; // place holder
		int finialNum = 0; // starting number for letter count

		for (int i = 0; i < initialText.length(); i++) { // for every thing inside the initial text...
			char c = initialText.charAt(i); // creating a simple data thing that will add
			if (initialText.substring(i, i + 1).equals(" ")) { // ...if a character in the initialText string equals/is
																// a space then ...

				finialText += "\n"; // ... enter new line

			} else { // if its not a space then...

				finialText += initialText.substring(i, i + 1); // ... print out letters
				finialNum++; //add a number to finialNum count

			}

		}
		System.out.println(finialText);
		System.out.println("Your input has " + finialNum + " non-blank characters");

	}

}
