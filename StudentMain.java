public class StudentMain {
    static class Student {
        String name;
        int rollNo;
        Student(String name, int rollNo) { this.name = name; this.rollNo = rollNo; }
        void display() { System.out.println("Name: " + name); System.out.println("Roll No: " + rollNo); }
    }
    public static void main(String[] args) {
        Student student = new Student("Sneha", 101);
        student.display();
    }
}
