package Seminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sem3_3 {
    public static void main(String[] args){
       /* Задать список типа ArrayList<String>.
          Поместить в него как строки, так и целые числа.
          Пройти по списку, найти и удалить целыен числа. */
          DelListNumber();
        }
    public static void DelListNumber() {
        List<String> list = new ArrayList<>();
        List<String> listWithoutNumber = new ArrayList<>();
        String[] AllPlanets = new String[]{"Earth", "Mars", "Jupiter", "Uran"};
       
        for (int i = 0; i < 10; i++) {
            if (i%2==0)
                list.add(AllPlanets[(int)(Math.random()*AllPlanets.length)]);
            else
                {
                    Integer num = new Random().nextInt(10);
                    list.add(Integer.toString(num));
                }     
        } 

         for (String string : list) {
            System.out.print(string+ " ");
         } 
         System.out.println();
         for (String string : list) {
            try {
                Integer.parseInt(string);
            }
            catch(Exception ex) {
                listWithoutNumber.add(string);
            }
         }
         for (String string : listWithoutNumber) {
            System.out.print(string + " ");
         }
    }
}
