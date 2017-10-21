package regularexpression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatcherFindStartEndExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	        String text    =
	                "This is the text which is to be searched " +
	                "for occurrences of the word 'is'.";

	        String patternString = "is";

	        /*Pattern pattern = Pattern.compile(patternString);
	        Matcher matcher = pattern.matcher(text);

	        int count = 0;
	        while(matcher.find()) {
	            count++;
	            System.out.println("found: " + count + " : "
	                    + matcher.start() + " - " + matcher.end());
	        }*/
	        
	        Pattern pattern = Pattern.compile("is");
	        Matcher matcher = pattern.matcher(text);
	        int count = 0;
	        while(matcher.find())
	        {
	        	matcher.start();
	        	matcher.end();
	        }
	        
	     /*   System.out.println(Pattern.matches("[amn*]", "abc"));//false (not a or m or n)  
	        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
	        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
	        */
	        
	       /* System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
*/	        System.out.println("test" + Pattern.matches("[a-zA-Z0-9]{4}", "arun"));//false (more than 6 char)  
	       /* System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
	        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
	        */
	    }

}
