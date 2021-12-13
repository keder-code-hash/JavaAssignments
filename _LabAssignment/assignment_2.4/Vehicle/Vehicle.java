abstract class Vehicle {
    static int id=100001;
    int vehicleId;
    String companyName;
    int price;


    Vehicle(int price,String companyName){
        this.price=price;
        this.companyName=companyName;
        this.vehicleId=id++;
    }    


    

}



/*
	LightMotorVehicle lAr[]=new LightMotorVehicle[5];
        HeavyMotorVehicle hAr[]=new HeavyMotorVehicle[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter you choice: "+"\n "+"1 for lightWeightMotor"+"\n"+"2 for heavy motor vehicle");
            int choice=sc.nextInt();
            if(choice==1){
                lAr[i]=new LightMotorVehicle(123.4+i,234+i,"Honda"+i);
            }
            else if(choice==2){
                hAr[i]=new HeavyMotorVehicle(1232.4+i,2342+i,"Tata"+i);
            }
            else {
                System.out.println("wrong choice");
            }
        }
        sc.close();
        
        for(int i=0;i<5;i++){
            if(lAr[i]!=null)
            {
                System.out.println(lAr[i].toString());
                System.out.println("Mileage : "+lAr[i].mileage);
            }
        }
        for(int i=0;i<5;i++){
            if(hAr[i]!=null)
            {
                System.out.println(hAr[i].toString());
                System.out.println("Capacity : "+hAr[i].capacity);
            }
        }
*/
