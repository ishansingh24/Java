import java.io.Serializable;

public class student implements Serializable {
    private String name;
    private String lastName;
    private int age;

    public student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "student [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void DisplayName()
    {
        System.out.println("my name is "+ this.name);
    }

}
