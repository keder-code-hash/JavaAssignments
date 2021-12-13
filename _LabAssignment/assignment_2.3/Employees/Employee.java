public class Employee {
    private static int idGen=0;
    private int id;
    private String name;
    private String dept;
    private double salary;
    
        
    Employee(String name,String dept,double salary){
        this.id=idGen;
        idGen++;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    public String toString() {
        return "Employee [dept=" + dept + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
    } 
    public int getId() {
        return id;
    } 
    public String getName() {
        return name;
    } 
    public String getDept() {
        return dept;
    } 
    public void setDept(String dept) {
        this.dept = dept;
    } 
    public double getSalary() {
        return salary;
    } 
    public void setSalary(double salary) {
        this.salary = salary;
    } 
}
