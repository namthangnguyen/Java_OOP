package exercise.learning;

class Person {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("name " + name);
    }
}

class Employee extends Person {
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void show() {
        super.show();
        System.out.println("salary " + salary);
    }
}

class Leaner extends Person {
    float point;
}

class Manager extends Employee {
    Employee assistant;

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
}

public class UpDownCasting {
    static void doSomeThing(Person e) {
        if (e instanceof Employee) {
            System.out.println("E");
        } else if (e instanceof Leaner) {
            System.out.println("L");
        }
    }

    public static void main(String[] args) {
        /** Upcasting: nhìn nhận đối tượng thuộc lớp dẫn xuất (C) như là một đối tượng thuộc lớp cơ sở (P)
         * P sẽ không sử dụng được các phương thức/thuộc tính riêng của C (báo lỗi compile vì không tồn tại)
         * nhưng với các phương thức/thuộc tính chung thì P sẽ thực thi bằng các phương thức/thuộc tính của C (virtual method)
         * Đó là đa hình đối tượng:
         *      - Nhìn nhận đối tượng theo nhiều kiểu khác nhau ~ UpDownCasting
         *      - Các đối tượng khác nhau giải nghĩa các thông điệp theo cách thức khác nhau
         *
         * VD: Employee, Manager kế thừa Person
         *
         * Person p1 = new Person();
         * Person p2 = new Employee();
         * Person p3 = new Manager();
         * ...
         * p1.getDetail() sẽ giải mã thông điệp theo cách của Person
         * p2.getDetail() _______ Employee
         * p3.getDetail() _______ Manager
         *
         *
         * Tips để sử dụng PT/TT riêng của C: là sử dụng C
         * */
        Person p;
        Employee e = new Employee();
        p = e; // Upcasting
        p.setName("Hoa");
        // p.setSalary(1000); // compile error: vì p không tồn tại phương thức setSalary
        p.show(); // sẽ giải nghĩa thông điệp theo cách của Employee
        e.setSalary(1000); // tips
        p.show(); 


        // Nhìn nhận đối tượng theo nhiều kiểu khác nhau
        Person p1 = new Leaner();
        Person p2 = new Employee();
        // Chỉ Downcasting được khi nó là đối tượng được Upcasting lên :(
        Employee ee = (Employee) p2; // Downcasting
        ee.show();

        UpDownCasting.doSomeThing(p1);
        UpDownCasting.doSomeThing(p2);
    }
}
