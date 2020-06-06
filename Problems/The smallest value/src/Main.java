import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 0;
        long f;
        do {
            n++;
            f = 1;
            for (long i = 2; i <= n; i++) {
                f *= i;
            }
        } while (f <= m);
        System.out.println(n);
    }
}