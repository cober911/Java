package Seminar;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalTime;

public class sem1_1 { 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scan.nextLine();
        Print(name);

        scan.close();
    }
    public static void Print(String name) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11,59))){
            System.out.printf("Доброе утро, " + name);
        }
        else if(now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17,59))){
            System.out.printf("Добрый день, " + name);
        }   
        else if(now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22,59))){
            System.out.printf("Добрый вечер, " + name);
        } 
        else if(now.isAfter(LocalTime.of(23,0)) && now.isBefore(LocalTime.of(4,59))){
            System.out.printf("Доброй ночи, " + name);
        }
        

    }
}
