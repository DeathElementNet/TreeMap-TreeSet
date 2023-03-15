import java.util.Comparator;

public class ComparatorMaxSurname implements Comparator<Person> {
    protected int maxSurnameWords;
    protected int firstLength;
    protected int secondLength;

    public ComparatorMaxSurname(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    //Делим фамилии на слова
    public int compare(Person o1, Person o2) {
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
}