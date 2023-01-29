package HomeWork.DZ_1;
import java.util.Scanner;

public class DZ_1_1 {
    /*  Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Введите число: ");
        int numb = scan.nextInt();
        int s=0, f=1;
        for (int i = 1; i <= numb; i++) {                
            s+=i;
            f*=i;
        }
        System.out.println("Треугольного число: " + s);
        System.out.println("Факториал числа: " + f);
    }

}


