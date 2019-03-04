public class Recursion {

    public static long factorial(int i) {
        if (i < 2) { // stopping/base case
            return 1;
        }
        long result = i * factorial(i - 1);  // recursion
        return result;
    }

    public static void main(String[] args) {
        int[] x = {1, 3, 5, 10};
        for (int i : x) {
            System.out.println("" + i + "!=" + factorial(i));
        }
    }
}
