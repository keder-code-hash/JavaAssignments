public class HeavyMotorVehicle extends Vehicle { 
    double capacity;

    HeavyMotorVehicle(double capacity,int price,String companyName){
        super(price,companyName); 
        this.capacity=capacity;
    }

    public String toString() {
        return "Vechicle [comapnyName=" + companyName + ", price=" + price + ", vehicleId=" + vehicleId +", capacity="+this.capacity+ "]";
    }
     
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    
    
}
