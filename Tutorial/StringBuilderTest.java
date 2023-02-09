package Tutorial;


public class StringBuilderTest {
    public static void main(String[] args){
      StringBuilder str1 = new StringBuilder("PKGT");
      StringBuilder str2 = new StringBuilder("- best");
      StringBuilder str3 = new StringBuilder(" college");
      System.out.println(str1.charAt(1)); 
      str1.setCharAt(2, 'j');
      System.out.println(str1);
      str2.append(str3);
      System.out.println(str2);
      System.out.println(str3.insert(3, str1));     
      System.out.println(str3.delete(2, 4));
      System.out.println(str2.replace(1, 2, "99"));
      System.out.println(str1.reverse());
    }
}
