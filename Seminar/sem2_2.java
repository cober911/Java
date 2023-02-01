package Seminar;

public class sem2_2 {
    public static void main(String[] args){
        /* Напишите метод, который сжимает строку. Пример: вход aaaabbbbcddd. Выход abcd
         charAt(i) и indexOf(s)
         */
        String name = "aaaabbbbcdddaaabbb";
        System.out.println(CompresString(name));
        
    }
    public static String CompresString(String name) {
        String res = "";
        for (int i = 0; i < name.length(); i++) {
            if(res.indexOf(name.charAt(i))==-1) res+=name.charAt(i);
        }
        return res;
    }
}
