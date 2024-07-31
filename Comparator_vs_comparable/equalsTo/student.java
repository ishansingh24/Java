public class student {
    private String name;

    public String getName() {
        return name;
    }

    public student(String name) {
        this.name = name;
    }
  
    @Override
    public String toString() {
        return "student [name=" + name + "]";
    }

    public boolean equals(Object anObject) {

        student s = (student)anObject;
        return this.name == s.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
