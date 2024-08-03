public record person(String name, String lastName, int age) {

    public person(String fname, int age)
    {
        this(fname,null,age);
    }

    public void DisplayName()
    {
        System.out.println("my name is "+ this.name);
    }

    public static void Staticcall()
    {
        System.out.println("i am static function called by class name");
    }
}
