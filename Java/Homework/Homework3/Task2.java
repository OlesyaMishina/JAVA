import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

/**
 * Task1
 */
public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 8, 7, 56, 14, 0, 9, 145));
        System.out.println(arr.toString());
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr.toString());
    }
}