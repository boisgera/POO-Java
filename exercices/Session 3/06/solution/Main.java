public class Main {
  public static void main(String[] args) {
    System.out.println(new Fraction(7)); // 7
    System.out.println(new Fraction(2, 3)); // 2/3
    System.out.println((new Fraction(1, 3)).add(new Fraction(1, 6))); // 1/2
    System.out.println((new Fraction(1, 6)).multiply(new Fraction(3, 1))); // 1/2
    System.out.println(new Fraction(1, 0)); // génère une ereur (dénom nul.)
  }
}