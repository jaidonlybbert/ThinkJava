
public class Tile {
  private char letter;
  private int value;

  public Tile(char letter, int value) {
    this.letter = letter;
    this.value = value;
  }

  public String toString() {
    return String.format("Value: %d\nLetter: %c\n", value, letter);
  }

  public boolean equals(Tile that) {
    return (this.letter == that.letter && this.value == that.value);
  }

  public void printTile(Tile tile) {
    System.out.println(tile.toString());
  }

  public static void testTile() {
    Tile t = new Tile('Z', 10);
    t.printTile(t);
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public char getLetter() {
    return this.letter;
  }

  public void setLetter(char letter) {
    this.letter = letter;
  }

  public static void main(String[] args) {
    Tile.testTile();
  }
}
