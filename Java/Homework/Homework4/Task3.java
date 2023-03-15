// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        double a = iScanner.nextInt();
        ArrayList<Double> arList = new ArrayList<Double>();
        arList.add(a);
        System.out.println("Enter : + - / *\nEnter cansel for cansel last operation\nEnter stop for exit.");
        String sign = iScanner.next();
        while (!sign.equals("stop")) {
            // while (!sign.equals("stop")) {
            if (!sign.equals("cansel")) {
                System.out.println("Enter integer: ");
                double b = iScanner.nextInt();
                double res = 0;
                switch (sign) {
                    case "+":
                        res = arList.get(arList.size() - 1) + b;
                        arList.add(res);
                        break;
                    case "-":
                        res = arList.get(arList.size() - 1) - b;
                        arList.add(res);
                        break;
                    case "*":
                        res = arList.get(arList.size() - 1) * b;
                        arList.add(res);
                        break;
                    case "/":
                        res = arList.get(arList.size() - 1) / b;
                        arList.add(res);
                        break;
                    default:
                        System.out.println("The sign is incorrect.");
                        break;
                }
            } else if (arList.size() > 1) {
                arList.remove(arList.size() - 1);
                System.out.println(arList.size());
            }
            System.out.println("The result is " + arList.get(arList.size() - 1));
            System.out.println("Enter : + - / * ");
            sign = iScanner.next();
        }
        iScanner.close();
    }
}
