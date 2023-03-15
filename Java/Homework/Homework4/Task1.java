// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {

    public static LinkedList<Integer> reverse(LinkedList<Integer> lList) {
        System.out.println(lList.toString());
        int temp = 0;
        for (int i = 0; i < lList.size()/ 2; i++) {
            temp = lList.get(i);
            lList.set(i, lList.get(lList.size() -1 - i));
            lList.set(lList.size() -1 - i, temp);
        }
        System.out.println(lList.toString());
        return lList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        reverse(ll);
    }
}
