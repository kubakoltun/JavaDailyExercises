public class StringSplit {
    public static String[] solution(String s) {

        double w = s.length()/2.0;
        int a = (int) Math.ceil(w);
        String[] str = new String[a];
        String pst = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++) {

            pst += s.charAt(i);
            if(i == s.length()-1 && s.length() % 2 != 0) {
                str[j] = pst + '_';
                j++;
                pst = "";
            }

            if (i % 2 != 0) {
                if (i == s.length()-1) {
                    str[j] = pst;
                    j++;
                    pst = "";
                }
                else {
                    str[j] = pst;
                    if (pst.length() == 2) {
                        //str[j] += ", ";
                    }
                    j++;
                    pst = "";
                }
            }
        }
        return str;
    }
}
