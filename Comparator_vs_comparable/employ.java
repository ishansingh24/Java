public class employ implements Comparable<employ>{
    private String name;
    private String lastName;
    private int age;

    /**
     * @param name
     * @param lastName
     * @param age
     */
    public employ(String name, String lastName, int age)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "employ [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
    }

    public String getName() {
        return name;
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

    public void setName(String name)
    {
        this.name = name;
    }
    public int compareTo(employ o)
    {
        return this.age - o.age;
    }
}
