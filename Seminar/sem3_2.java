package Seminar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sem3_2 {
    public static void main(String[] args){
    /* Заполнить список названиями планет Солнечной системы в произвольном порядке.
     * Вывести название каждой планеты и количество повторений в списек.
     * Пройти по списку и удалять повторяющиеся элементы. */
        FillPlanets();
    }
    public static void FillPlanets(){
        String[] planets = {"Venera", "Jupiter", "Mars", "Earth"};
        List<String> planetlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            planetlist.add(planets[(int)(Math.random()*planets.length)]);
        }
        planetlist.sort(null);
        System.out.println(planetlist);
        int count = 1;
        for (int i = 1; i < planetlist.size(); i++) {
            if (planetlist.get(i)!=planetlist.get(i-1)) {
                System.out.println(planetlist.get(i-1) + " " + count);
                count = 1;}
            else count++;
            }
            System.out.println(planetlist.get(planetlist.size()-1) + " " + count);
    }
    
}
