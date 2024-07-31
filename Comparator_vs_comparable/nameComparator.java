
import java.util.Comparator;

public class nameComparator implements Comparator<employ>{
    @Override
    public int compare(employ o1, employ o2)
    {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public String toString() {
        return "ageComparator []";
    }
}
