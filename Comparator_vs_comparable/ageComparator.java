import java.util.Comparator;
public class ageComparator implements Comparator<employ> {
    @Override
    public int compare(employ o1, employ o2)
    {
        return o1.getAge() - o2.getAge();
    }

    @Override
    public String toString() {
        return "ageComparator []";
    }
}
