package learning;

class Student {
    private int year;
    private String name;

    public Student(String name, int year) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class PassByValue {
    public static void change(Student std) {
        std.setYear(2000);
    }

    public static void change2(Student std) {
        std = new Student("Hung", 1995);
    }

    public static void main(String[] args) {
        Student std = new Student("Nam", 1990);
        System.out.println(std.getYear());
        change2(std);
        System.out.println(std.getYear());
    }
}
