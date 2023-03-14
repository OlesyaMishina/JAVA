import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the array through the space: ");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        iScanner.close();
        String[] arr_str = str.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        double sum = 0;
        for (int i = 0; i < arr_str.length; i++) {
            arr.add(Integer.parseInt(arr_str[i]));
            sum +=arr.get(i);
        }
        System.out.println(arr.toString());
        System.out.println("Minimum value is "+Collections.min(arr));
        System.out.println("Maximum value is "+Collections.max(arr));
        double avr = sum/arr.size();
        System.out.println("Average value is " + avr);
    }
}
