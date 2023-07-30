import java.util.HashMap;

class to_leet_speak {
    static String toLeetSpeak(final String speak) {
      StringBuilder res = new StringBuilder();
      HashMap<Character, Character> leetMap = new HashMap<>();
      leetMap.put('A', '@');
      leetMap.put('B', '8');
      leetMap.put('C', '(');
      leetMap.put('D', 'D');
      leetMap.put('E', '3');
      leetMap.put('F', 'F');
      leetMap.put('G', '6');
      leetMap.put('H', '#');
      leetMap.put('I', '!');
      leetMap.put('J', 'J');
      leetMap.put('K', 'K');
      leetMap.put('L', '1');
      leetMap.put('M', 'M');
      leetMap.put('N', 'N');
      leetMap.put('O', '0');
      leetMap.put('P', 'P');
      leetMap.put('Q', 'Q');
      leetMap.put('R', 'R');
      leetMap.put('S', '$');
      leetMap.put('T', '7');
      leetMap.put('U', 'U');
      leetMap.put('V', 'V');
      leetMap.put('W', 'W');
      leetMap.put('X', 'X');
      leetMap.put('Y', 'Y');
      leetMap.put('Z', '2');
        
      for (int i = 0; i < speak.length(); i++) {
        char currentChar = speak.charAt(i);
        char leetChar = leetMap.getOrDefault(currentChar, currentChar);
        res.append(leetChar);
      }
        
      return res.toString();
    }
}
