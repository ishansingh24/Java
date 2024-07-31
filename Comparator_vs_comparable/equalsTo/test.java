
public class test {
    public static void main(String[] args)
    {
        student s1 = new student("ishan");
        student s2 = new student("ishan");

        if(s1 == s2)
        {
            System.out.println("object is equal");
        }
        else{
            System.out.println("object not equal ji");
        }

        if(s1.equals(s2))
        {
            System.out.println("object is equal");
        }
        else{
            System.out.println("object not equal ji");
        }
    }
}
