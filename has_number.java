public class has_number {
    public static void main(String[] args) {
        System.out.println(metoda(new char[]{'a', 'b', '1', '0'}));
        System.out.println(metoda(new char[]{'9', 'a', 'b'}));
        System.out.println(metoda(new char[]{'a', 'b'}));
        System.out.println(metoda(new char[]{'a', 'b', '3'}));
    }

    public static boolean metoda(char[] slowo) {
//        for (int i = 0; i < slowo.length; i++) {
//            System.out.println(slowo[i]);
//            if (Character.isDigit(slowo[i])) {
//                return true;
//            }
//        }
        for (int i = 0; i < slowo.length; i++) {
            System.out.println(slowo[i]);
            if (slowo[i] == '0' || slowo[i] == '1' || slowo[i] == '2' || slowo[i] == '3' || slowo[i] == '4' || slowo[i] == '5' || slowo[i] == '6' || slowo[i] == '7' || slowo[i] == '8' || slowo[i] == '9') {
                return true;
            }
        }
        return false;
    }
}
