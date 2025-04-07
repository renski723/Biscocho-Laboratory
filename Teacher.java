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