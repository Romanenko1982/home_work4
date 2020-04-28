package local.task_19;

public class CountOfWords {

  public static void main(String[] args) {

    String str = "Люблю грозу в начале мая, когда весенний первый гром, как бы";
    String[] a = str.trim().split(" +");
    System.out.println(a.length);
  }
}

