import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение y: ");
        double y = scanner.nextDouble();

        System.out.print("Введите значение z: ");
        double z = scanner.nextDouble();

        double maxXZ = Math.max(x, z);
        double minXYZ = Math.min(x, Math.min(y, z));

        double L = 2 * maxXZ - 3 * minXYZ;

        System.out.println("L = " + L);

        scanner.close();
    }
}
