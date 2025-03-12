import java.util.Scanner;

public class task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты точки (x): ");
        double x = scanner.nextDouble();
        System.out.print("Введите координаты точки (y): ");
        double y = scanner.nextDouble();

        checkCircle(x, y);
        checkБублик(x, y);
        checkSquare(x, y);

        scanner.close();
    }

    private static void checkCircle(double x, double y) {
        double radius = 1.0;
        if (x * x + y * y < radius * radius) {
            System.out.println("A. Принадлежит заданной плоскости.");
        } else {
            System.out.println("A. Не принадлежит заданной плоскости.");
        }
    }

    private static void checkБублик(double x, double y) {
        double outerRadius = 1.0;
        double innerRadius = 0.5;
        double distanceSquared = x * x + y * y;

        if (distanceSquared < outerRadius * outerRadius && distanceSquared >= innerRadius * innerRadius) {
            System.out.println("Б. Принадлежит заданной плоскости.");
        } else if (distanceSquared >= outerRadius * outerRadius) {
            System.out.println("Б. Не принадлежит заданной плоскости.");
        } else {
            System.out.println("Б. Не принадлежит заданной плоскости.");
        }
    }

    private static void checkSquare(double x, double y) {
        if (x >= -1 && x <= 1 && y >= -1 && y <= 1) {
            System.out.println("В. Принадлежит заданной плоскости.");
        } else {
            System.out.println("В. Не принадлежит заданной плоскости.");
        }
    }
}