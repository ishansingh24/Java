public class student {
    private String name;
    private String last_name;
    private int age;

    public student()
    {
        
    }
    public student(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public student setName(String name) {
        this.name = name;
        return this;
    }
    public String getLast_name() {
        return last_name;
    }
    public student setLast_name(String last_name) {
        this.last_name = last_name;
        return this;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "student [name=" + name + ", last_name=" + last_name + ", age=" + age + "]";
    }
    public student setAge(int age) {
        this.age = age;
        return this;
    }

}
