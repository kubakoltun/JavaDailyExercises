public class bad_password_generator {
        public static String bad_password_generator(int rand_swt) {
                String base = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz12345674890!_-&#$%";
                java.util.Random rand = new java.util.Random();
                StringBuilder builder = new StringBuilder();
        
                    while(builder.toString().length() == 0) {
                        for (int i = 0; i < rand_swt; i++) {
                            builder.append(base.charAt(rand.nextInt(base.length())));
                        }
                    }
          
                    return builder.toString();
        }
}
