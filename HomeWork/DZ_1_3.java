package HomeWork;
import java.util.Scanner;

public class DZ_1_3 {
    /* Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). */
    public static void main(String[] args) {
        boolean comeback = false;
        do {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = in.nextInt();
        System.out.print("Введите второе число: ");
        int numb_b = in.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = in.next().charAt(0);
        
        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d",res);
                break;
        }
        System.out.println("\nДля выхода введите '1', для продолжения '2'");
        int value = in.nextInt();
        if(value == 1) comeback = true;
        else System.out.println("И снова здравствуйте!");
        } while (!comeback);
        
        
    }
    
}

