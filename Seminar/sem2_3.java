package Seminar;

public class sem2_3 {
    /*
     * Напишите метод, который принимает на вход строку (StringBulder) и определяет
     * является ли строка палиндромом (возвращает boolean значение).
     * equals и StringBulder для revers
     */
    public static void main(String[] args) {
        System.out.println(isPalindrom("kannak4"));
    }
    
    public static boolean isPalindrom(String name){
        StringBuilder str = new StringBuilder(name).reverse();
        return name.equals(str.toString());
    }
}
