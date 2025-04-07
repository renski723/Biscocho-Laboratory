public class Person{
    private String name;
    private int id;
 
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
 
    public String getName() {
        return this.name;
    }
 
    public int getId() {
        return this.id;
    }
 
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}
 
class Student extends Person {
    private String gradeLevel;
 
    public Student(String name, int id, String gradeLevel) {
        super(name, id);
        this.gradeLevel = gradeLevel;
    }
 
    public String getGradeLevel() {
        return this.gradeLevel;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + this.gradeLevel);
    }
}
 
class Teacher extends Person {
    private String subject;
 
    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
 
    public String getSubject() {
        return this.subject;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + this.subject);
    }
}
 
class Staff extends Person {
    private String department;
 
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
 
    public String getDepartment() {
        return this.department;
    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + this.department);
    }
}
 
class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Renski", 1234, "College");
        Teacher teacher = new Teacher("Sir Archie", 2345, "OOP");
        Staff staff = new Staff("Sir Joel", 3456, "Hardware");
 
        System.out.println("  Student Information  ");
        student.displayInfo();
 
        System.out.println("\n  Teacher Information  ");
        teacher.displayInfo();
 
        System.out.println("\n  Staff Information  ");
        staff.displayInfo();
    }
}
 
 