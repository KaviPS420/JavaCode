package StringManipulation;

public class stringRevByword {

	public static void main(String[] args) {
		
		        String s = "This is a test string";

		        String[] words = s.split(" ");

		        System.out.println("Original string: " + s);
		        System.out.print("Reversed words: ");
		        for (String e : words) {
		            System.out.print(reverseWord(e) + " ");
		        }
		    }

		    public static String reverseWord(String word) {
		        StringBuilder reversed = new StringBuilder();
		        for (int i = word.length() - 1; i >= 0; i--) {
		            reversed.append(word.charAt(i));
		        }
		        return reversed.toString();
		    }
		


	}


