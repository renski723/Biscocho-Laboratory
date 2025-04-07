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
 class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("Renski", 1234, "College");
        Teacher teacher = new Teacher("Sir Archie", 2345, "OOP");
        Staff staff = new Staff("Sir Aramil", 3456, "Program Chair");
 
        System.out.println("  Students Information  ");
        student.displayInfo();
 
        System.out.println("\n  Teachers Information  ");
        teacher.displayInfo();
 
        System.out.println("\n  Staffs Information  ");
        staff.displayInfo();
    }
}
 
 