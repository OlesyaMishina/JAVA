
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

/**
 * Task1
 */
public class Task1A {

    public static void bubble(int[] array) throws IOException {

        Logger logger = Logger.getLogger(Task1A.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("logger.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat);
        logger.info(Arrays.toString(array));

        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            boolean flag=false;
            for (int j = 0; j < array.length -i- 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=true;
                    logger.info(Arrays.toString(array));
                }      
            }
        if (flag==false)  break; 
        }
    }

    public static void main(String[] args) throws IOException{
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
    

