import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;



public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Yura", "Lapshin-Lapshin", 18));
        people.add(new Person("Elena", "Lapshina-Fa", 10));
        people.add(new Person("Mishail", "Shultskiy", 20));
        people.add(new Person("Antonio", "Serj-Ko", 30));
        people.add(new Person("Ivan", "Hurakan", 40));

        System.out.printf("\nСписок людей до сортировки:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
        System.out.println(people);

        Comparator<Person> ComparatorMaxSurname = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int maxSurnameWords = 3;
                int firstLength;
                int secondLength;

                String[] ar1 = o1.getSurname().split(" ");
                String[] ar2 = o2.getSurname().split(" ");


                firstLength = ar1.length;
                secondLength = ar2.length;

                //приравниваем к лимиту, если фамилии длиннее установленного
                if (ar1.length > maxSurnameWords) {
                    firstLength = maxSurnameWords;
                }

                if (ar2.length > maxSurnameWords) {
                    secondLength = maxSurnameWords;
                }

                //Проверка по возрасту, если фамилии одинаковые
                if (firstLength == secondLength) {
                    return o1.getAge() - o2.getAge();
                } else {
                    return firstLength - secondLength;
                }
            }
        };
        Collections.sort(people, ComparatorMaxSurname);
        // форматированный вывод списка
        System.out.printf("\nСписок после сортировки:%s.\n", people.toString().replaceAll("\\[|\\]", ""));

        Predicate<Person> ifAge = age -> age.getAge() < 18;
        people.removeIf(ifAge);
        System.out.printf("\nСписок после удаления:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}