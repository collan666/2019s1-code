public class Loops {
    
    public static long factorial3(int n) {
        long total = 1;
        for (int i = 2; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static long factorial1(int n) {
        long total = 1;
        int i = 2;
        while (i <= n) {
            total *= i; // total = total * i;
            i++;
        }
        return total;
    }

    public static long factorial2(int n) {
        if (n < 2) {
            return 1;
        }
        long total = 1;
        int i = 2;
        do {
            total *= i;
            i++;
        } while (i <= n);
        
        return total;
    }

    public static void main(String[] args) {
        long l1 = factorial1(9);
        long l2 = factorial2(9);
        long l3 = factorial3(9);
        System.out.println("" + l1 + ", " + l2 + ", " + l3);
    }
}
