import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x (начало интервала): ");
        double x = scanner.nextDouble();
        System.out.print("Введите y (конец интервала): ");
        double y = scanner.nextDouble();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double num3 = scanner.nextDouble();

        scanner.close();

        System.out.println("Числа, принадлежащие интервалу (" + x + ", " + y + "):");
        if (num1 > x && num1 < y) {
            System.out.println(num1);
        }
        if (num2 > x && num2 < y) {
            System.out.println(num2);
        }
        if (num3 > x && num3 < y) {
            System.out.println(num3);
        }
    }
}
