import java.util.Arrays;
import java.util.LinkedList;

public class test {
public static void main(String[] args) {
    LinkedList<Integer> lList = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8));
    int temp = 0;
    int i =3;
    // for (int i = 0; i < (lList.size()-1)/2; i++) {
        temp = lList.get(i);

        lList.set(i, lList.get(lList.size() -1 - i));

        // System.out.println(lList.get(lList.size()-1 - i));
        // System.out.println(temp);
        lList.set(lList.size()-1 - i, temp);
        System.out.println(lList.size()-2 - i);
        // System.out.println(lList.get(lList.size()-1 - i));
    // }
    System.out.println(lList.toString());
    // return lList; 
}

    }