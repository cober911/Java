package Seminar;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sem2_4 {
    /* Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
       который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    public static void main(String[] args){
        FileWriteInfo();
    }
    public static void FileWriteInfo(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String name = scan.nextLine();
    try {
        FileWriter fw = new FileWriter("1.txt");
        for (int i = 0; i < 100; i++) {
            fw.write(name);
            fw.append('\n');
        } 
        fw.close();

    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    finally{
        scan.close();
    }
    }

    
}
