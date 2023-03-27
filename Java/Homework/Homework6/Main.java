// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void Filter(Set<NoteBook> nb) {
        System.out.println(
                "Enter sorting parameter :\n1 - for sorting by RAM,\n2 - for sorting by SSD,\n3 - for sorting by OS,\n4 - for sorting by color.\nEnter stop for exit.");
        Scanner iScanner = new Scanner(System.in);
        String answer = iScanner.nextLine();
        while (!answer.equals("stop")) {
            switch (answer) {
                case "1":
                    System.out.println("Enter the RAM value: 4, 8, 16 or 32 GB.");
                    Integer ram = Integer.parseInt(iScanner.nextLine());
                    for (var element : nb) {
                        if (element.ram == ram)
                            System.out.println(element);
                    }
                    break;

                case "2":
                    System.out.println("Enter the SSD value: 128, 256, 512 GB.");
                    Integer ssd = Integer.parseInt(iScanner.nextLine());
                    for (var element : nb) {
                        if (element.ssd == ssd)
                            System.out.println(element);
                    }
                    break;

                case "3":
                    System.out.println("Enter the type of OS: Windows or Linux.");
                    String os = iScanner.nextLine();
                    for (var element : nb) {
                        if (element.os.equals(os))
                            System.out.println(element);
                    }
                    break;

                case "4":
                    System.out.println("Enter the color: silver, black or red.");
                    String color = iScanner.nextLine();
                    for (var element : nb) {
                        if (element.color.equals(color))
                            System.out.println(element);
                    }
                    break;
            }
            System.out.println(
                    "Enter sorting parameter :\n1 - for sorting by RAM,\n2 - for sorting by SSD,\n3 - for sorting by OS,\n4 - for sorting by color.\nEnter stop for exit.");
            answer = iScanner.nextLine();
        }
        iScanner.close();
    }

    public static void main(String[] args) {

        NoteBook Note1 = new NoteBook(1, 4, 128, "Linux", "silver");
        NoteBook Note2 = new NoteBook(2, 8, 256, "Windows", "black");
        NoteBook Note3 = new NoteBook(3, 32, 512, "Windows", "red");
        NoteBook Note4 = new NoteBook(4, 16, 128, "Windows", "silver");
        NoteBook Note5 = new NoteBook(5, 32, 256, "Linux", "black");

        Set<NoteBook> nb = new HashSet<NoteBook>();
        nb.add(Note1);
        nb.add(Note2);
        nb.add(Note3);
        nb.add(Note4);
        nb.add(Note5);

        Filter(nb);
    }

}
