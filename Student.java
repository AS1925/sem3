interface Exam {
    void percent_cal();
}
class Student {
    String name;
    int roll_no, mark1, mark2;
    Student(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        mark1 = m1;
        mark2 = m2;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + mark1 + ", " + mark2);
    }
    public static void main(String[] args) {
        Result r = new Result("Mr.X", 12, 93, 84);
        r.display();
        r.percent_cal();
    }
}
class Result extends Student implements Exam {
    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }
    public void percent_cal() {
        float percent = (mark1 + mark2) / 2.0f;
        System.out.println("Percentage: " + percent + "%");
    }
}