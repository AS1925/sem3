class Employee {
    public String name;
    protected int id;
    private double salary;

    Employee(String n, int i, double s) {
        name = n; id = i; salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    protected void bonus() {
        System.out.println("Bonus: " + salary * 0.1);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String n, int i, double s, String d) {
        super(n, i, s); dept = d;
    }

    void display() {
        super.display();
        System.out.println("Department: " + dept);
    }
}

class Staff extends Employee {
    int hours;

    Staff(String n, int i, double s, int h) {
        super(n, i, s); hours = h;
    }

    void display() {
        super.display();
        System.out.println("Working Hours: " + hours);
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        Manager m = new Manager("Mr.X", 101, 50000, "Sales");
        Staff s = new Staff("Mr.Y", 202, 60000, 50);

        m.display();
        m.bonus();

        s.display();
        s.bonus();
    }
}