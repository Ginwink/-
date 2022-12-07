package Build_Collection.Set;

public class Stu_al1 {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stu_al1 stu_al1 = (Stu_al1) o;

        if (age != stu_al1.age) return false;
        return name != null ? name.equals(stu_al1.name) : stu_al1.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stu_al1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
