package Build_Collection.Map;

public class Student_demo {
    private String name;
    private String wife;

    public Student_demo(){ }

    public Student_demo(String name, String wife) {
        this.name = name;
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student_demo that = (Student_demo) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return wife != null ? wife.equals(that.wife) : that.wife == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (wife != null ? wife.hashCode() : 0);
        return result;
    }
}
