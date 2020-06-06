import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        double yearPart = p / 100.0 + 1;
        int years = 0;
        while (m < k) {
            years++;
            m *= yearPart;
        }
        System.out.println(years);
    }
}
