package OOPs.AbstractClasses;

public abstract  class MyCar {
  static final int a = 10;
}
  class B extends MyCar {
    static int a = 11;
  }

  class Main extends B {
    public static void main(String[] args) {
      System.out.println(a);
    }
  }
