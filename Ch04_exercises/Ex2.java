public class Ex2 {
  public static void zool(int val, String pet, String street) {
    int value = val;
    String firstPet = pet;
    String firstStreet = street;
    System.out.printf("Value: %d\nPet: %s\nStreet: %s\n", value, firstPet, firstStreet);
  }
  public static void main(String[] args) {
    zool(11, "Maomao", "Easy");
  }
}
