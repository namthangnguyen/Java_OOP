package exercise.learning;

public class Konstructer {
    private String name;
    private int age;
    private boolean isMale;

    public Konstructer() { }

    // Tạo một Constructer sẽ làm mất Constructer mặc định của JVM, nếu muốn có
    // Default Constructer (là Constructer không tham số) thì phải khai báo như trên
    // (được khuyến khích khi đã tự tạo một Constructer)
    public Konstructer(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void info() {
        System.out.println("Ban " + name + ", " + age + " tuoi, gioi tinh " + isMale);
    }

    public static void main(String[] args) {
        // thử xóa cái khai báo
        Konstructer test = new Konstructer();
        test.info();
    }
}
