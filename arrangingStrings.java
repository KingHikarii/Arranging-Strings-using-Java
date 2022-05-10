//Java Program, the sort a array of strings, and get the first and last word within the array of string.

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

			//insertedWord = input.nextLine();
			System.out.println(i + "." + "Please enter a keyword: ");
			arrayOfStrings[i] = input.nextLine();
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
