//Record is used to create specail type of class which helps to create data carrying object and it was introduced in java 14.
public class Record {
    public static void main(String []args)
    {
        person p = new person("ishan", "singh", 24);
        System.out.println(p);
        System.out.println(p.name());
        System.out.println(p.lastName());
        System.out.println(p.age());
        p.DisplayName();
        person.Staticcall();
    }
}
