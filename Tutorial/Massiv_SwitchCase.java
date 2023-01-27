package Tutorial;
import java.util.Scanner;
public class Massiv_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mass = new int[5];
        for (int i = 0; i < 5; i++) {
            mass[i] = scan.nextInt();

        //     int newElement = i + 1;
        //     mass[i] = newElement;
        //     System.out.println("Значение индекса " + i + " Заполняется элементом " + newElement);
        }
        printMass(mass);
        printDayOfWiik(2);
    }
    public static void printMass(int[] mass) {
        // for(int  i= 0; i < mass.length; i++){
        //     System.out.println("Значение индекса " + i + " Заполняется элементом " + mass[i]);
        for(int el: mass){
            System.out.println("Элемент : " + el);
        }
    }
    public static void printDayOfWiik(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
        
            case 2:
                System.out.println("Вторник");
                break;
            }   
            
    }

    
}