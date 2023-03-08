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
        equation = equation.replaceAll("\\s", ""); // заменяем все пробелы (\\s) пустую строку

        // Находим знак = и результат
        int equal_sign = equation.indexOf("="); // indexOf("=") возвращает индекс знака = в строке
        int e = Integer.parseInt(equation.substring(equal_sign + 1, equation.length())); // substring(equal_sign + 1, equation.length() возвращает 
        // подстроку по указанным в скобках индексам, от знака = до конца выражения, сразу переводим в int

        // Находим знак операции и определяем его
        int sign_index; // индекс знака операции
        char sign;  // сам знак операции
        if (equation.indexOf("+") == -1) {  //если сивол не найден indexOf вернет -1, то есть эта строка значит - если не +
            if (equation.indexOf("-") == -1) {  // если не -
                if (equation.indexOf("*") == -1) {  // если не *
                    sign_index = equation.indexOf("/");  // значит знак /, возвращаем его индекс и сам знак запоминаем
                    sign = '/';
                } else {
                    sign_index = equation.indexOf("*");  // если не -1, значит вернет индекс знака *, запоминаем  
                    sign = '*';
                }
            } else {
                sign_index = equation.indexOf("-"); // если не -1, значит вернет индекс знака - запоминаем
                sign = '-';
            }
        } else {
            sign_index = equation.indexOf("+"); // если не -1, значит вернет индекс знака +, запоминаем
            sign = '+';
        }

        // ищем в q и w знаки ?, заменяем на числа от 0 до 9
        boolean flag = false;   // для случая если нет решения
        for (int i = 1; i < 10; i++) {   // делаем цикл от 1 до 9, можно поставить от 0, но при делении тогда выходит ошибка.
            // в цикле на оба места подставляем вместо ? значения i от 1 до 9.
            String q_str = equation.substring(0, sign_index); // выделяем подстроку q от 0, до индекса знака
            String w_str = equation.substring(sign_index + 1, equal_sign); // выделяем подстроку w от индекса знака +1 до индекса знака =
            String i_str = Integer.toString(i);                            // переводим i в строку
            q_str = q_str.replace("?", i_str);                    // заменяем q строке ? на i
            w_str = w_str.replace("?", i_str);                 // заменяем w строке ? на i
            int q = Integer.parseInt(q_str);                             // переводим в числорезультат 
            int w = Integer.parseInt(w_str);

            // проверяем возможность решения
            switch (sign) {                              // оператор switch делает ветвление как if, смотрит знак sign)
                case '+':                        // в случае +
                    if (q + w == e) {              // если верно
                        System.out.printf("%d %s %d = %d\n", q, sign, w, e);   // нашли решение
                        flag = true;                            // флаг поднимаем
                        break;                                   // выходим из цикла, ниже то же самое для остальных знаков
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
        if (flag == false)  // если флаг не поднят - пишем что решений нет!
        System.out.println("There is no solution.");
    }
}
