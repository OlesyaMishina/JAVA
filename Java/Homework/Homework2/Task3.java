import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
public class Task3 {
    public static void main(String[] args) throws IOException{
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
        Logger logger = Logger.getLogger(Task1A.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("calc.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat);
        StringBuilder sb=new StringBuilder();
        sb.append(Double.toString(a)+sign+Double.toString(b) + "="+ Double.toString(res));
        // System.out.print(sb);
        logger.info(sb.toString());

    }

}
