package regularexpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String text    =
	            "This is the text to be searched " +
	            "for occurrences of the http:// pattern.";

	        String patternString = ".*http://.*";

	        Pattern pattern = Pattern.compile(patternString);

	        Matcher matcher = pattern.matcher(text);
	        boolean matches = matcher.matches();
	        System.out.println("matches" + matches);*/
	        
	        
	        String text1    =
	                "This is the text to be searched " +
	                "for occurrences of the http:// pattern.";

	        String patternString1 = "This is the";

	        Pattern pattern1 = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
	        Matcher matcher1 = pattern1.matcher(text1);

	        System.out.println("lookingAt = " + matcher1.lookingAt());
	        System.out.println("matches   = " + matcher1.matches());

	}

}
