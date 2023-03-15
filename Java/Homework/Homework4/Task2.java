import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static LinkedList<Integer> enqueue(LinkedList<Integer> lList) {
        System.out.println("Enter the integer to add:");
        Scanner iScanner = new Scanner(System.in);
        lList.add(Integer.parseInt(iScanner.nextLine()));
        return lList;
    }

    public static int dequeue(LinkedList<Integer> lList) {
        // System.out.println("The first element was:");
        Scanner iScanner = new Scanner(System.in);
        int firstElement;
        if (lList.size()>1) 
            firstElement= lList.removeFirst();
        else {
            System.out.println("This element is the last! I can't to delete it...");
            firstElement=lList.getFirst();
        }
        return firstElement;
    }

    public static int first(LinkedList<Integer> lList) {
        // System.out.println("The first element was:");
        Scanner iScanner = new Scanner(System.in);
        int firsElement = lList.getFirst();
        return firsElement;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println(
                "Enter:\n 1 - to add the last element\n 2 - to remove the first element\n 3 - to view the first element\n or enter stop to exit:");
        Scanner iScanner = new Scanner(System.in);
        String answer = iScanner.nextLine();
        while (!answer.equals("stop")) {
            switch (answer) {
                case "1":
                    enqueue(ll);
                    break;
                case "2":
                    System.out.printf("The first element was " + dequeue(ll) + "\n");
                    break;
                case "3":
                    System.out.printf("The first element is " + first(ll) + "\n");
                    break;
            }
            System.out.println(ll.toString());
            System.out.println(
                    "Enter:\n 1 - to add the last element;\n 2 - to remove the first element\n 3 - to view the first element\n or enter stop to exit:");
            answer = iScanner.nextLine();
        }
        iScanner.close();
    }
}
