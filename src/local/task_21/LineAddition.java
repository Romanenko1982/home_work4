package local.task_21;

import java.util.Calendar;

public class LineAddition {

  public static void main(String[] args) {

    String result1 = " ";
    String str1 = "Люблю грозу в начале мая, когда весенний первый гром, ";
    int quantity = 100;

    System.out.println("Concatination with String");
    long t1 = Calendar.getInstance().getTimeInMillis();
    for (int i = 0; i < quantity; i++) {
      result1 = str1.concat("как бы резвяся и играя, грохочет в небе голубом.");
      System.out.println(result1);
    }

    System.out.println("Concatination with StringBuilder");
    long t3 = Calendar.getInstance().getTimeInMillis();
    for (int i = 0; i < quantity; i++) {
      StringBuilder s = new StringBuilder(str1);
      System.out.println(s.append("как бы резвяся и играя, грохочет в небе голубом."));
    }
    System.out.println();

    long t2 = Calendar.getInstance().getTimeInMillis();
    long deltaString = t2 - t1;
    System.out.println("выполнение процедуры для String составило " + deltaString + " milsec.");
    long t4 = Calendar.getInstance().getTimeInMillis();
    long deltaStringBuilder = t4 - t3;
    System.out.println(
        "Выполнение процедуры для StringBuilder составило " + deltaStringBuilder + " milsec.");

  }
}
