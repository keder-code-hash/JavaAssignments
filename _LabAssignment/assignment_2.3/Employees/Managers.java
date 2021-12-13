public class Managers extends Employee{
    private double bonus;

    Managers(String name,String dep,double salary){
        super(name,dep,salary);
    }

    Managers(String name,String dep,double salary,double bonus){
        super(name,dep,salary);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String display(){
        return "Manager[bonus="+bonus+",toString()="+super.toString()+"]";

    }
}

// hascode is used to show the assigned value for all object which is dixtict from one another