class Student {
    int age;
    String name, address;

    Student (String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void display() {
        System.out.println("***STUDENT INFO***");
        System.out.println("Name: " + name + "\n" + "Address: " + address + "\n" + "Age: " + age);
    }
}

class PGStudent extends Student {
    int age;
    int percentage;
    String course;
    PGStudent(String name, String course, int percentage, String address, int studentAge) {
        super(name, address, studentAge);
        this.percentage = percentage;
        this.course = course;
        age = super.age;
    }

    void display() {
        super.display();
        System.out.println("Course: " + course + "\n" + "Percentage: " + percentage);
    }
}
public class Test {
    public static void main(String[] args) {
        Student std = new Student("ABC", "BCA", 19);
        PGStudent pg = new PGStudent("XYZ", "XYZ Street", 90, "ABC Street", 20);

        std.display();
        pg.display();
    }
}
