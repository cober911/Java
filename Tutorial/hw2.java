package Tutorial;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

  /* Нужно считать с консоли число, создать целочисленный массив размером введенного числа, заполнить его (с помощью класса Random)
Пробежаться по циклу и найти освпадающее число с введенным (второе введенное число), вывести в консоль(нашлось или нет) вывод результата 
совпадения реализовать с foreach. */

public class hw2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    //   Random rnd = new Random();

    //   System.out.println("Введите размер массива: ");
    //   int number = scan.nextInt();

    //   int[] mass = new int[number];
    //   for(int i = 0; i < mass.length; i++){
    //       mass[i] = rnd.nextInt(30);
    //     }
      
    //   System.out.println("Введите искомое число");  
    //   int number2 = scan.nextInt();
    //   int temp0 = 0;
    //   for(int element: mass){
    //         if (element == number2) {
    //             temp0 +=1;
    //         }
    //     }
    //     System.out.println("Совпадение найдено: " + temp0);
    // // Найти наибольшее число в данном массиве. 
    //     int temp=0;
    //     for (int i = 0; i < mass.length; i++) {
    //         if (mass[i] > temp) {
    //             temp = mass[i];
    //         }
    //     }
    //     System.out.println(Arrays.toString(mass));
    //     System.out.println("Наибольшее число:" + temp);

        /* Реализовать простейший калькулятор используя кострукцию switch-case
        С консоли вводится два числа, которые будут принимать участие в операции
        Далее выводится сообщение в таком виде: Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком
        Вывести результат операции. */
        System.out.println("Введите два числа для операции: ");
        int first = scan.nextInt();
        int second = scan.nextInt();
        System.out.println("Выберете операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком");
        int number1 = scan.nextInt();
        int result = 0;
        
        switch (number1) {
            case 1:
            result = first + second;
                break;
        
            case 2:
            result = first - second;
                break;
            case 3:
            result = first / second;
                break;
            case 4:
            result = first % second;
                break;
                   
        }
        System.out.println("Результат: " + result);
    }
}