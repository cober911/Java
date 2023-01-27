package Seminar;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.LocalTime;
import java.util.Arrays;

// 1. Дан массив двоичных чисел, например [1,1,0,1,1,1,1], вывести максимальное кол-во подряд идущих 1.
// 2. Найти максимальное кол-во подряд идущих одинаковых элементов массива. (постараться сделать с одним циклом).
public class sem1_2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] mass = new int[] {1,1,0,1,1,1,1};
    System.out.println(Arrays.toString(mass));
    int x = 1, count = 0, maxCount = 0;
    
    for (int i = 0; i < mass.length; i++) {
       if (mass[i] == x) {
            count ++;
            if (maxCount < count) maxCount = count;
       } else count = 0;
    }
    System.out.println("Кол-во единиц: " + maxCount);
    }    
}
    

