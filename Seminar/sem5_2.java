package Seminar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class sem5_2 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // Map<Integer, String> names = new HashMap<>();
        // for (int i = 0; i < 3; i++) {
        //     System.out.print("Введите номер и фамилию: ");
        //     String[] name = iScanner.nextLine().split(" ");//name[0] - номер. name[1] - фамилия
        //     names.put(Integer.parseInt(name[0]), name[1]);
        // }

        // for (Map.Entry<Integer, String> el : names.entrySet()) {
        //     if (el.getValue().equals("Ivanov"))
        //         System.out.print(el.getKey()+ ": "+ el.getValue() + "\n");
        // }
        // iScanner.close();
        //System.out.println(IsIzomorph());
        System.out.println(Skobki());
    }

    public static Boolean IsIzomorph(){
        Map<Character, Character> pairs = new HashMap<>();
        String s1 = "title";
        String s2 = "title";
        // s = "paper",  t = "tiqle"
        // key -> value
        // p -> t
        // a -> i
        // p -> q - не изоморф
        // e -> l
        // r -> e
        // addaa  изоморфно eggee? - да
        // addaa  изоморфно egghh? - нет
        if (s1.length()!=s2.length()) 
            return false;
        if (s1.equals(s2))
            return true;
        for (int i = 0; i < s1.length(); i++) {
            Character a = s1.charAt(i);//символ первого слова
            Character b = s2.charAt(i);//символ второго слова
            // если в map уже есть ключ "a", то тогда значение по ключу a должно соответствовать "b"
            if (pairs.containsKey(a) && pairs.get(a)!=b)
                return false;
            else
                pairs.put(a, b);
        }
        return true;
    }

    private static Boolean Skobki() {
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('[', ']');
        String str = "[a+(d*3])";
        Stack<Character> curentSkobki = new Stack<>();
        for (int index = 0; index < str.length(); index++) {
            Character a = str.charAt(index);
            if (pairs.containsKey(a)) 
                curentSkobki.push(pairs.get(a));
            else if (pairs.containsValue(a)){
                if (curentSkobki.isEmpty())
                    return false;
                else if (a!=curentSkobki.pop())
                    return false;
            }
        }
        return curentSkobki.isEmpty();
    }
}
