public class duplicate_encoder {
	static String encode(String word) {
            StringBuilder istr = new StringBuilder();
            StringBuilder jstr = new StringBuilder();
            StringBuilder nstr = new StringBuilder();
            int countchar = 0;
            for (int i = 0; i < word.length(); i++) {
                istr.append(word.charAt(i));
                for (int j = 0; j < word.length(); j++) {
                    jstr.append(word.charAt(j));
                    if (istr.toString().toLowerCase().equals(jstr.toString().toLowerCase())) {
                      System.out.println(istr + "=" + jstr);
                        countchar++;
                    }
                    jstr = new StringBuilder();
                }
                if (countchar > 1) {
                    nstr.append(")");
                }
                else {
                    nstr.append("(");
                }
                istr = new StringBuilder();
                countchar = 0;
            }
    
            return nstr.toString();
        }
}
