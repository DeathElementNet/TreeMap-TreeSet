import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Yura", "Lapshin", 30));
        people.add(new Person("Elena", "Lapshina", 31));
        people.add(new Person("Mishail", "Shultskiy", 3));
        people.add(new Person("Antonio", "Serj", 36));
        people.add(new Person("Ivan", "Hurakan", 55));

        Collections.sort(people, new ComparatorMaxSurname(10));
        System.out.println(people);
    }
}