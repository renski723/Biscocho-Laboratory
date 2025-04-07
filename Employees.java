public class Employees {
   
    private String name;
    private int age;
    protected double salary;  
   
    public Employees(String name, int age, double salary) {
 
        this.name = name;
        this.age = age;
        this.salary = salary;
   
    }
 
    //Behaviors
     public String getName() {
        return this.name;
      }
       public int getAge() {
        return this.age;
      }
      public double getSalary() {
        return this.salary;
      }
      public void raiseSalary() {
        this.salary *= 1.2;
      }
 
      public static void main (String[] args) {

        Employees emp = new Employees("Laurens kiffyman", 50000, 30);
 
        System.out.println("Name:" + emp.getName());
        System.out.println("Age:" + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
 
        emp.raiseSalary();
 
        System.out.println("New Salary after raise;" + emp.getSalary());
      }
 
 
}
 