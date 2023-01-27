package Tutorial;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first;
        int second;
        System.out.println("Введите числа: ");
        first = scan.nextInt();
        second = scan.nextInt();

        
        System.out.println("Сумма: " + sum(first, second));
    }       
    public static int sum(int one, int two) {
        return one + two;
    }    

}
