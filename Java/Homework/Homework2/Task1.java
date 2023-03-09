import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

/**
 * Task1
 */
public class Task1 {

    public static void writer(int[] array) {
        try {
            FileWriter fr = new FileWriter("log.txt", true);
            fr.write(Arrays.toString(array));
            fr.write("\n");
            fr.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void bubble(int[] array) {
        int temp = 0;
        writer(array);
        for (int i = 0; i < array.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j < array.length -i- 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=true;
                    writer(array);
                }   
            // writer(array);       
            }
        if (flag==false)  break; 
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the array through the space: ");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        iScanner.close();
        String[] arr_str = str.split(" ");
        int[] arr = new int[arr_str.length];
        for (int i = 0; i < arr_str.length; i++) {
            arr[i] = Integer.parseInt(arr_str[i]);
        }
        bubble(arr);
    }
}