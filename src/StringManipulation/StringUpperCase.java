package StringManipulation;
//
//public class StringUpperCase {
//
//	public static void main(String[] args) {
//		String s = "this is my java code am totally working on it, please make it worth";
//		
//		String ss[] = s.split(" ");
//		String newstr = "";
//		for (String e : ss) {
//			
//			newstr = newstr +e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase())+ " ";
//		}
//
//		System.out.println(newstr);
//	}
//
//}
public class StringUpperCase {

    public static void main(String[] args) {
        String s = "";
        
        String ss[] = s.split(" ");
        String newstr = "";
        for (String e : ss) {
            newstr = newstr + Character.toUpperCase(e.charAt(0)) + e.substring(1) + " ";
        }

        System.out.println(newstr.trim()); // trim() is used to remove the trailing space
    }

}
