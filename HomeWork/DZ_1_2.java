package HomeWork;
import java.util.Scanner;

public class DZ_1_2 {
    /* Вывести все простые числа от 1 до 1000 */
    public static void main(String[] args) {
        boolean b = true;
        for (int q = 2; q <= 1000; q++) {
            for (int i = 2; i < q; i++) {
                if (q % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(", " + q);
            else b = true;
        }
    }
}
