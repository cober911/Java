package Seminar;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class sem2_5 {
    /* Напишите метод, который вернет содержимое текущей папки в виде массива строк.
     * Напишите метод, который выведет массив, возвращенный предыдущим методом в файл.
     * Обработайте ошибки с помощью try-cath конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
     * https://metanit.com/java/tutorial/6.11.php
     * ["Sem1", "Sem2"]
     */
    public static void main(String[] args) {
        File folder = new File("d:/GB/6.Java/vscode/Seminar/");
        System.out.println(ScanFolder(folder).toString());
    }

    public static StringBuilder ScanFolder(File folder){
    StringBuilder allFiles = new StringBuilder();
    // folder.isDirectory
    try{
        for (File fileEntry : folder.listFiles()) {
                allFiles.append(fileEntry.getName());
            }
    }
    catch(Exception e){
        try{
            FileWriter errorLog  = new FileWriter("error.log");
            errorLog.write(e.getMessage());
            errorLog.close();
        }
        catch(IOException ex){
            ex.getMessage();   
        }  
    }
    return allFiles;
    }
    
}



