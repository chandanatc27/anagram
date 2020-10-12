import java.util.ArrayList;
import java.util.Collections;
public class Anagram {

	public static void main(String[] args) {


	    
	    String string1 = "story";
	    System.out.println("1st string is "+string1);

	    
	    String string2 = "ryots";
	    System.out.println("2nd string is "+string2);

	    ArrayList<Character> arr1 = new ArrayList<>();
	    ArrayList<Character> arr2 = new ArrayList<>();

	    //Adding chars of a string to ArrayList
	    for (Character c : string1.toCharArray()) {
	        arr1.add(c);
	    }

	    //Adding chars from a string to ArrayList
	    for (Character c : string2.toCharArray()) {
	        arr2.add(c);
	    }

	    Collections.sort(arr1);
	    Collections.sort(arr2);
	    
	    if (arr1.equals(arr2)) {
	        System.out.println("yay given strings are anagram");
	      
	    } else
	        System.out.println("strings are not anagram !!");

	
	    
	}
}
