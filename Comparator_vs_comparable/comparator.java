import java.util.ArrayList;
import java.util.Collections;

class comparator{

    public static void main(String []args)
    {
        ArrayList<employ>marks =  new ArrayList<>();
        employ e1 = new employ("ishan", "kumar", 42);
        employ e2 = new employ("hritk", "joshi", 49);
        employ e3 = new employ("james", "kumari", 42);
        employ e4 = new employ("rahul", "shah", 42);
        employ e5 = new employ("sonu", "kumar", 100);
        System.out.println("hello ji");
        marks.add(e1);
        marks.add(e2);
        marks.add(e3);
        marks.add(e4);
        marks.add(e5);
        Collections.sort(marks, new nameComparator());

        // Collections.sort(marks);
        System.out.println(marks);

    }
}