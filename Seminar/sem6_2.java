package Seminar;
import java.time.LocalDateTime;

public class sem6_2 {
    String name;
    String color;
    LocalDateTime date;
    String breed;

    void Print() {
        System.out.println(name + " "+ color + " "+date+" "+ breed );
    }

    sem6_2(String n, String c, LocalDateTime d, String b) {
        name = n;
        color = c;
        date = d;
        breed = b;
    }
    // sem6_2(LocalDateTime d, String n, String c, String b){
    //     name = n;
    //     color = c;
    //     date = d;
    //     breed = b;
    // }
    sem6_2() {
        name = "Gray";
        color = "Black";
        date =  LocalDateTime.now();
        breed = "scotland";
    }
    sem6_2(String name, String color) {
        this.name = name;
        this.color = color;
        date =  LocalDateTime.now();
        breed = "scotland";
    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass()) return false;
        sem6_2 comparesem6_2 = (sem6_2) obj; 
        if (this.name.equals(comparesem6_2.name) && this.color.equals(comparesem6_2.color)) return true;
        return false;
    }
    @Override
    public int hashCode() {
        int res = this.name.hashCode() + this.color.hashCode() + this.breed.hashCode();
        return res;
    }
}
