 //Create a Java application in which a user types in some words and names.
 //Then you take those inputs(names or words) sort them according to the first letter
 //And you sort them into an array that is according to a specific letter type.
 //Then make it so that if the user calls that container or array, it displays everything in that array.

 import java.util.*;

 public class arrangingStrings {
 	public static void main(String args[]) {

		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int max;
		max = input.nextInt();

		String insertedWord;
		String currentWord = "null";
		String firstWord = "null";

		String[] arrayOfStrings = new String[max];


		int i = 0;
		int j = 0;
		System.out.println("The length of the array is: " + arrayOfStrings.length);
		//for(i = 0;i<arrayOfStrings.length;i++)
		while (arrayOfStrings.length > i) {

			insertedWord = input.nextLine();
			System.out.println(i + "." + "Please enter a keyword: ");
			arrayOfStrings[i] = insertedWord;
			if (i == arrayOfStrings.length) {
				break;
			} else {
				i++;

			}
		}

		for (i = 0; i < arrayOfStrings.length; i++) {
			for (j = i + 1; j < arrayOfStrings.length; j++) {
				if (arrayOfStrings[j].compareTo(arrayOfStrings[i]) < 0) {

					String temp = arrayOfStrings[j];
					arrayOfStrings[j] = arrayOfStrings[i];
					arrayOfStrings[i] = temp;

					//System.out.println();
					//System.out.println(arrayOfStrings[i]);
				}
			}
		}

		//String firstWord = "null";

		System.out.println("Words In Sorted Order: ");
		for (i = 0; i < arrayOfStrings.length; i++) {
			System.out.println(i + ":" + arrayOfStrings[i]);
		}

		for (i = 0; i < arrayOfStrings.length; i++) {


			currentWord = arrayOfStrings[i];
			//currentChar = currentWord.charAt(0);


		}
		firstWord = arrayOfStrings[1];
		System.out.println("The first word is: " + firstWord);
		System.out.println("The last word is: " + currentWord);


	}
 		}
