public class Demo {

  public static void main(String[] args) {
    D a = D.B;
    switch (a) {
      case A:
        System.out.println("A");
      case B:
        System.out.println("B");
      case C:
        System.out.println("C");
    }
    if (true && false || false) {

    }
  }
}

enum D {
  A, B, C
}
