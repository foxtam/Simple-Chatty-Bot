import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        for (int count = scanner.nextInt(); count > 0; count--) {
            int n = scanner.nextInt();
            if (n % 4 == 0 && n > maximum) {
                maximum = n;
            }
        }
        System.out.println(maximum);
    }
}