public class Student {
    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }

    public void isPassed() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 85);
        Student student2 = new Student(2, "Bob", 35);

        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Marks: " + student1.getMarks());
        student1.isPassed();

        System.out.println("Student ID: " + student2.getId());
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student Marks: " + student2.getMarks());
        student2.isPassed();
    }
}
