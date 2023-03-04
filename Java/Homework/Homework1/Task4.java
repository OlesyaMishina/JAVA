import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter the equation: ");
        String equation = iScanner.nextLine();
        equation = equation.replaceAll("\\s", "");

        // Находим знак = и результат
        int equal_sign = equation.indexOf("=");
        int e = Integer.parseInt(equation.substring(equal_sign + 1, equation.length()));

        // Находим знак операции и определяем его
        int sign_index;
        char sign;
        if (equation.indexOf("+") == -1) {
            if (equation.indexOf("-") == -1) {
                if (equation.indexOf("*") == -1) {
                    sign_index = equation.indexOf("/");
                    sign = '/';
                } else {
                    sign_index = equation.indexOf("*");
                    sign = '*';
                }
            } else {
                sign_index = equation.indexOf("-");
                sign = '-';
            }
        } else {
            sign_index = equation.indexOf("+");
            sign = '+';
        }

        // ищем в q и w знаки ?, заменяем на числа от 0 до 9
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            String q_str = equation.substring(0, sign_index);
            String w_str = equation.substring(sign_index + 1, equal_sign);
            String i_str = Integer.toString(i);
            q_str = q_str.replace("?", i_str);
            w_str = w_str.replace("?", i_str);
            int q = Integer.parseInt(q_str);
            int w = Integer.parseInt(w_str);

            // проверяем возможность решения
            switch (sign) {
                case '+':
                    if (q + w == e) {
                        System.out.printf("%d %s %d = %d\n", q, sign, w, e);
                        flag = true;
                        break;
                    }
                case '-':
                    if (q - w == e) {
                        System.out.printf("%d %s %d = %d\n", q, sign, w, e);
                        flag = true;
                        break;
                    }
                case '*':
                    if (q * w == e) {
                        System.out.printf("%d %s %d = %d\n", q, sign, w, e);
                        flag = true;
                        break;
                    }
                case '/':
                    if (q / w == e) {
                        System.out.printf("%d %s %d = %d\n", q, sign, w, e);
                        flag = true;
                        break;
                    }
            }
        }
        if (flag == false)
        System.out.println("There is no solution.");
    }
}
