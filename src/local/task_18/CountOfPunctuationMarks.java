package local.task_18;

public class CountOfPunctuationMarks {

  public static void main(String[] args) {
    String str = "Текствая, ! строка, - с ? несколькими, запятыми; и :";

//Первый вариант решения
//    int n = 0;
//    char symbol;
//    for (int i = 0; i < str.length(); i++) {
//      symbol = str.charAt(i);
//      if (symbol == '.') {
//        n++;
//      } else if (symbol == ',') {
//        n++;
//      } else if (symbol == ':') {
//        n++;
//      } else if (symbol == ';') {
//        n++;
//      } else if (symbol == '!') {
//        n++;
//      } else if (symbol == '?') {
//        n++;
//      } else if (symbol == '-') {
//        n++;
//      }
//    }
//    System.out.println(n);

//    второй вариант решения
    char[] ch = {',', '.', '!', '?', '-', ';', ':'};
    int n = 0;
    for (int i = 0; i < ch.length; i++) {
      char symbol1 = ch[i];
      int p = 0;
      while (p != -1) {
        p = str.indexOf(symbol1, p);
        if (p != -1) {
          n++;
          p++;
        }
      }
    }
    System.out.println(n);

    // Третий вариант решения
//    Pattern p = Pattern.compile("[,.!;:?-]");
//    Matcher m = p.matcher(str);
//    int count = 0;
//    while (m.find()) {
//      count++;
//    }
//    System.out.println(count);
  }
}

