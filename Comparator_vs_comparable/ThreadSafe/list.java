import java.util.ArrayList;
import java.util.concurrent.*;

public class list {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String>list = new CopyOnWriteArrayList<>();

        list.add("ishan");
        list.add("hritk");
        list.add("sonu");
        list.add("rahul");
        list.add("jignesh");
        list.add("hemant");


        Runnable t1 = () -> {

            for(String x : list)
            {
                System.out.println(x);
            }
        };

        Runnable t2 = () -> {

            list.add("kk");
            list.add("sonu nigam");
            list.add("shreaya");
        };

        new Thread(t1).start();
        new Thread(t2).start();


    }
}
