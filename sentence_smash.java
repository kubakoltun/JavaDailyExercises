import java.util.Arrays;

public class sentence_smash {
	public static String smash(String... words) {
	    String concat = "";
		
	    for (int i = 0; i < words.length; i++) {
	      if (i == 0) {
		concat = words[i];
	      } else {
		concat = concat + " " + words[i];
	      }
	    }
		
    return concat;
  }
}
