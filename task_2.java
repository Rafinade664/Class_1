import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вещественное число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите вещественное число b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите вещественное число c: ");
        double c = scanner.nextDouble();

        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));
        double p = (max + min) / 2;

        System.out.println("Результат p = " + p);

        scanner.close();
    }
}
