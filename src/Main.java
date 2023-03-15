import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Yura", "Lapshin-Lapshin", 10));
        people.add(new Person("Elena", "Lapshina-Fa", 10));
        people.add(new Person("Mishail", "Shultskiy", 10));
        people.add(new Person("Antonio", "Serj-Ko", 10));
        people.add(new Person("Ivan", "Hurakan", 10));

        Collections.sort(people, new ComparatorMaxSurname(10));
        System.out.println(people);
    }
}