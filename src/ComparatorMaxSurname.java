import java.util.Comparator;
import java.util.StringTokenizer;

public class ComparatorMaxSurname implements Comparator<Person> {
    private int maxNumberOfWords;

    public ComparatorMaxSurname(int maxNumberOfWords) {
        this.maxNumberOfWords = maxNumberOfWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        StringTokenizer str1 = new StringTokenizer(o1.getSurname());
        StringTokenizer str2 = new StringTokenizer(o2.getSurname());

        if (str1.countTokens() >= maxNumberOfWords || str2.countTokens() >= maxNumberOfWords) {
            if (str1.countTokens() < str2.countTokens()) {
                return -1;
            } else if (str1.countTokens() > str2.countTokens()) {
                return 1;
            }
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}