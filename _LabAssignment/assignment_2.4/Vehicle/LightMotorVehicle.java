class LightMotorVehicle extends Vehicle{ 
    double mileage;

    LightMotorVehicle(double mileage,int price,String companyName){
        super(price,companyName); 
        this.mileage=mileage;
    }

    public String toString() {
        return "Vechicle [comapnyName=" + companyName + ", price=" + price + ", vehicleId=" + vehicleId +", mileage="+this.mileage+ "]";
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

}
