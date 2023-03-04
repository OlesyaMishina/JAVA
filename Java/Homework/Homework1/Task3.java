import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        double a = iScanner.nextInt();
        System.out.println("Enter : + - / * ");
        char sign = iScanner.next().charAt(0);
        System.out.println("Enter integer: ");
        double b = iScanner.nextInt();
        double res = 0;
        switch (sign) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        System.out.printf("%,1f %s %f = %f", a, sign, b, res);
        // System.out.println(res);

    }

}
