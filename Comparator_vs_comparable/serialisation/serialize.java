import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialize {

    public static void main(String [] args)
    {
        try{
            student s = new student("ishan", "singh", 24);
            FileOutputStream fos = new FileOutputStream("obj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("object state is transfered to file");
    }
    
}
