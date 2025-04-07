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