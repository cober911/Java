package Seminar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.management.relation.RoleList;

public class sem3_1 {
   
    public static void main(String[] args) {
        /* Даны строки, сравинить их с помощью == и метода equals() класса Objekt */
        /* String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1==s6);
        System.out.println(s1.equals(s6)); */

        /* Создать и заполнить лист десятью случайными числами, отсортировать через метод sort() и вывести этот метод */
        List<Integer> list = new ArrayList<>();
        FillSpisok(list);
        OutSpisok(list);
    }
    public static void FillSpisok(List<Integer> list){
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(100);
            list.add(value);
        }
    }
    public static void OutSpisok(List<Integer> list){
        list.sort(null);
        for (Integer integer : list) {
            System.out.print(" " + integer);
        }
    }

}