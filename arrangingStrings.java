 //Create a Java application in which a user types in some words and names.
 //Then you take those inputs(names or words) sort them according to the first letter 
 //And you sort them into an array that is according to a specific letter type.
 //Then make it so that if the user calls that container or array, it displays everything in that array.

 import java.util.*;

 public class arrangingStrings {
 	public static void main(String args[]) {

 	String insertedWord;
 	String[] arrayOfStrings = new String[10];
 	String[] arrayAtoF = new String[10];
	String[] arrayGtoL = new String[10];
	String[] arrayMtoR = new String[10];
	String[] arrayStoZ = new String[10];

 	Scanner input = new Scanner(System.in);	
 	int i = 0;
 	int j = 0;

 	for(i=0;i<arrayOfStrings.length;i++) 
 	{		
 	System.out.println("Please enter a keyword: ");
 	insertedWord = input.nextLine();
 	arrayOfStrings[i] = insertedWord;
 	}

 	for(i=0;i<arrayOfStrings.length;i++) 
 	{	
 		for(j = i+1; j<arrayOfStrings.length;j++) {
 			if(arrayOfStrings[j].compareTo(arrayOfStrings[i]) < 0) {
 				
 				String temp = arrayOfStrings[j];
 				arrayOfStrings[j] = arrayOfStrings[i];
 				arrayOfStrings[i] = temp;
 				
 				//System.out.println();
 				//System.out.println(arrayOfStrings[i]);
				}
 			}
		}
 	 	System.out.println("Words In Sorted Order: ");
 	 	for(i=0;i<arrayOfStrings.length;i++) {		
 		System.out.println();
 		System.out.println(arrayOfStrings[i]);
 		}		

 		if(arrayOfStrings[0] == 'A'){
 			System.out.println("This letter is an A"); }
 			else {
 				System.out.println("Failed.");
 			}
 		}	
	} 
