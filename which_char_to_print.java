public class which_char_to_print {
    public static void main(String[] args) {
            x_oPrint(11, 'o');
    }

    static void x_oPrint(int chars, char c) {
        int tab[] = {'x', 'o'};
        char n2 = ' ';
        char n1 = ' ';
      
        if (c == 'x') {
            n1 = 'x';
            n2 = 'o';
        } else {
            n1 = 'o';
            n2 = 'x';
        }
        for (int i = 0; i <= chars; i++) {
            if (i % 2 == 0) {
                System.out.print(n1);
            }
            else if (i % 2 != 0) {
                System.out.print(n2);
            }
        }
    }
}
