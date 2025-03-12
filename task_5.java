import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение k: ");
        int k = scanner.nextInt();
        
        System.out.print("Введите значение J: ");
        int J = scanner.nextInt();
        
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();
        
        System.out.print("Введите значение m: ");
        int m = scanner.nextInt();

        boolean isDivisor = true;

        if (J % k != 0) {
            isDivisor = false;
        }
        
        if (n % k != 0) {
            isDivisor = false;
        }
        
        if (m % k != 0) {
            isDivisor = false;
        }

        if (isDivisor) {
            System.out.println(k + " является делителем всех чисел: " + J + ", " + n + ", " + m);
        } else {
            System.out.println(k + " не является делителем одного или нескольких чисел: " + J + ", " + n + ", " + m);
        }

        scanner.close();
    }
}
