public class Ex3 {
  public static void printAmerican(String day, int date, String month, int year) {
    String thisDay = day;
    String thisMonth = month;
    int thisDate = date;
    int thisYear = year;

    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
  public static void main(String[] args) {
    printAmerican("Saturday", 22, "July", 2015);
  }
}
