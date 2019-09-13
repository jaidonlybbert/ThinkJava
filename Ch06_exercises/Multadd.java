public class Multadd {
  public static void main(String[] args) {
    System.out.println(multadd(1.0, 2.0, 3.0));
    System.out.println(Math.sin(Math.PI / 4) + (Math.cos(Math.PI / 4)) / 2);
    System.out.println(Math.log(10) + Math.log(20));
    System.out.println(expSum(5.0));
  }
  public static double multadd(double a, double b, double c) {
    return (a * b + c);
  }
  public static double expSum(double a) {
    return (multadd(a, Math.exp(-a), Math.sqrt(1 - Math.exp(-a))));
  }
}
