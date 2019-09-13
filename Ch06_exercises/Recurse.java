public class Recurse {

    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return (prod(m, n -1) * n);
        }
    }
}
