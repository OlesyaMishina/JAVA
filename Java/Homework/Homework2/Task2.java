import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task2 {
    public static void Pars_str(String str) {
        // str = ""фамилия":"Петрова","оценка":"4","предмет":"Информатика""";
        StringBuilder sb = new StringBuilder();
        String surname = str.substring(str.indexOf("фамилия") + 10, str.indexOf("оценка") - 3);
        String grade = str.substring(str.indexOf("оценка") + 9, str.indexOf("предмет") - 3);
        String subject = str.substring(str.indexOf("предмет") + 10, str.length() - 1);
        sb.append("Студент " + surname + " получил " + grade + " по предмету " + subject + ".");
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data2.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            Pars_str(str);
        }

    }
}
