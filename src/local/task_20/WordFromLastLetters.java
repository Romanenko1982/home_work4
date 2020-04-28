package local.task_20;

public class WordFromLastLetters {

  public static void main(String[] args) {
    String str = "Люблю грозу; в начале мая, когда весенний первый гром";

// Первый вариант решения
    String[] a = str.replaceAll("[,.;:!?]+", " ").trim().split(" +");
    for (int i = 0; i < a.length; i++) {
      char[] b = a[i].toCharArray();
      char lastLetter = ' ';
      for (int j = 0; j < b.length; j++) {
        lastLetter = b[b.length - 1];
      }
      System.out.print(lastLetter);
    }
// Второй вариант решения
//    Pattern p = Pattern.compile("\\p{L}\\b");
//    Matcher m = p.matcher(str);
//    while (m.find()) {
//      System.out.print(m.group());
//    }
  }
}







