import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialize {
    public static void main(String []args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("obj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            student s = (student)ois.readObject();
            System.out.println(s);
            s.DisplayName();
            //transient keyword used property does take the part in serialization

        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
