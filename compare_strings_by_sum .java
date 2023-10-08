public static boolean compare_strings_by_sum(String str1, String str2) {
    str1 = str1 == null ? "" : str1.toUpperCase();
    str2 = str2 == null ? "" : str2.toUpperCase();

    str1 = str1.replaceAll("[^a-zA-Z]", "");
    str2 = str2.replaceAll("[^a-zA-Z]", "");

    if (str1.isEmpty() || str2.isEmpty()) {
      return true;
    }

    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < str1.length(); i++) {
      sum1 += str1.charAt(i);
    }
    for (int i = 0; i < str2.length(); i++) {
      sum2 += str2.charAt(i);
    }

    return sum1 == sum2;
  }
