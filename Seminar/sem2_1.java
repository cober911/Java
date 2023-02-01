package Seminar;
import java.util.Scanner;

public class sem2_1 {
    /* Дано четное число N(>0) и символы c1 и c2. Написать метод который вернёт строку длины N, 
    которая состоит из чередующихся символов c1 и с2, начиная с c1.
    N = 5
    c1="Oleg"
    c2="Vasya"
    res = "OlegVasyaOlegVasyaOleg" */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Данные");
        int number = scan.nextInt();
        String c1 = scan.next();
        String c2 = scan.next();
        String res = "";
        for (int i = 0; i < number; i++) 
        res = (i % 2 == 0) ? res + c1 : res + c2;
        System.out.println(res);
    } 
}
