package Seminar;
import java.util.Scanner;
import java.util.Arrays;

// Данн массив nums = [3,2,1,2,3] и число val = 3.
// Если в массиве есть числа, равные задонному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементы массива должны быть отличны от заданного, а остальные равны ему. [2,2,1,3,3]
 public class sem1_3 {
    public static void main(String[] args){
    int[] arr = new int[10];
    FillMas(arr);
    PrintMass(arr);
    FindMaxCount(arr);
    }

    public static void PrintMass(int[] arr){
      for (var el: arr) {
        System.out.print(el + " ");
      }
      System.out.println();
        }

    public static void FillMas(int[] arr){
            for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*2);
        }
    }
    public static void FindMaxCount(int[] arr) {
        int counter = 1;
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] && arr[i] == 1){
                counter ++;
                if (counter>result) result = counter;
            }else
                counter = 1;
        }
        System.out.println(result);
    }
}        
  
