import java.util.Scanner;

/**
 * Task1
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
Ввод:5
Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120
 */


 public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.println("Enter integer: ");
        int n=iScanner.nextInt();
        iScanner.close();
        int sum=0;
        int fact=1;
        for (int i = 1; i <= n; i++) {
            sum+=i;
            fact*=i;
        }               
        System.out.printf("%d, %d", sum, fact);    
    } 
}