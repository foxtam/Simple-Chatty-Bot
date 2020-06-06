import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ascending = true;
        boolean ordered = true;
        int first = scanner.nextInt();
        int n;
        do {
            n = scanner.nextInt();
            if (n == 0) {
                System.out.println(true);
                return;
            }
        } while (first == n);
        if (n < first) ascending = false;
        int m;
        while (true) {
            m = scanner.nextInt();
            if (m == 0) break;
            if (ascending && n > m || !ascending && n < m) {
                ordered = false;
                break;
            }
            n = m;
        }
        System.out.println(ordered);
    }
}