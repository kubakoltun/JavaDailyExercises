public class block_letter_printer {
  public static String blockPrint(String input) {
      input = input.toUpperCase().trim(); 
      StringBuilder result = new StringBuilder();
    
      for (int row = 0; row < 7; row++) {
          for (int col = 0; col < input.length(); col++) {
              char c = input.charAt(col);
              String[] letterRepresentation = getLetterRepresentation(c);
              result.append(letterRepresentation[row]);
              if (col < input.length() - 1) {
                  result.append(" ");
              }
          }
          result.append("\n");
      }

      return result.toString().trim();
    }

    private static String[] getLetterRepresentation(char c) {
        switch (c) {
            
        case 'A': return new String[]{
                " AAA ",
                "A   A",
                "A   A",
                "AAAAA",
                "A   A",
                "A   A",
                "A   A"
        };
        case 'B': return new String[]{
                "BBBB ",
                "B   B",
                "B   B",
                "BBBB ",
                "B   B",
                "B   B",
                "BBBB "
        };
        case 'C': return new String[]{
                " CCC ",
                "C   C",
                "C    ",
                "C    ",
                "C    ",
                "C   C",
                " CCC "
        };
        case 'D': return new String[]{
                "DDDD ",
                "D   D",
                "D   D",
                "D   D",
                "D   D",
                "D   D",
                "DDDD "
        };
        case 'E': return new String[]{
                "EEEEE",
                "E    ",
                "E    ",
                "EEEEE",
                "E    ",
                "E    ",
                "EEEEE"
        };
        case 'F': return new String[]{
                "FFFFF",
                "F    ",
                "F    ",
                "FFFFF",
                "F    ",
                "F    ",
                "F    "
        };
        case 'G': return new String[]{
                " GGG ",
                "G   G",
                "G    ",
                "G GGG",
                "G   G",
                "G   G",
                " GGG "
        };
        case 'H': return new String[]{
                "H   H",
                "H   H",
                "H   H",
                "HHHHH",
                "H   H",
                "H   H",
                "H   H"
        };
        case 'I': return new String[]{
                "IIIII",
                "  I  ",
                "  I  ",
                "  I  ",
                "  I  ",
                "  I  ",
                "IIIII"
        };
        case 'J': return new String[]{
                "JJJJJ",
                "    J",
                "    J",
                "    J",
                "    J",
                "    J",
                "JJJJ "
        };
        case 'K': return new String[]{
                "K   K",
                "K  K ",
                "K K  ",
                "KK   ",
                "K K  ",
                "K  K ",
                "K   K"
        };
        case 'L': return new String[]{
                "L    ",
                "L    ",
                "L    ",
                "L    ",
                "L    ",
                "L    ",
                "LLLLL"
        };
        case 'M': return new String[]{
                "M   M",
                "MM MM",
                "M M M",
                "M   M",
                "M   M",
                "M   M",
                "M   M"
        };
        case 'N': return new String[]{
                "N   N",
                "NN  N",
                "N   N",
                "N N N",
                "N   N",
                "N  NN",
                "N   N"
        };
        case 'O': return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
        case 'P': return new String[]{
                "PPPP ",
                "P   P",
                "P   P",
                "PPPP ",
                "P    ",
                "P    ",
                "P    "
        };
        case 'Q': return new String[]{
                " QQQ ",
                "Q   Q",
                "Q   Q",
                "Q   Q",
                "Q Q Q",
                "Q  QQ",
                " QQQQ"
        };
        case 'R': return new String[]{
                "RRRR ",
                "R   R",
                "R   R",
                "RRRR ",
                "R R  ",
                "R  R ",
                "R   R"
        };
        case 'S': return new String[]{
                " SSS ",
                "S   S",
                "S    ",
                " SSS ",
                "    S",
                "S   S",
                " SSS "
        };
        case 'T': return new String[]{
                "TTTTT",
                "  T  ",
                "  T  ",
                "  T  ",
                "  T  ",
                "  T  ",
                "  T  "
        };
        case 'U': return new String[]{
                "U   U",
                "U   U",
                "U   U",
                "U   U",
                "U   U",
                "U   U",
                " UUU "
        };
        case 'V': return new String[]{
                "V   V",
                "V   V",
                "V   V",
                "V   V",
                "V   V",
                " V V ",
                "  V  "
        };
        case 'W': return new String[]{
                "W   W",
                "W   W",
                "W   W",
                "W W W",
                "W W W",
                "W W W",
                " W W "
        };
        case 'X': return new String[]{
                "X   X",
                "X   X",
                " X X ",
                "  X  ",
                " X X ",
                "X   X",
                "X   X"
        };
        case 'Y': return new String[]{
                "Y   Y",
                " Y Y ",
                "  Y  ",
                "  Y  ",
                "  Y  ",
                "  Y  ",
                "  Y  "
        };
        case 'Z': return new String[]{
                "ZZZZZ",
                "    Z",
                "   Z ",
                "  Z  ",
                " Z   ",
                "Z    ",
                "ZZZZZ"
        };
            default: return new String[]{
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     ",
                    "     "
            };
        }
    }
}
