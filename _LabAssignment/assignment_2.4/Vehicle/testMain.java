import java.util.*;
class testMain {

    public static void main(String[] args){


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
            }
        }
        for(int i=0;i<5;i++){
            if(hAr[i]!=null)
            {
                System.out.println(hAr[i].toString());
            }
        }
        
    }    
}




/*

	var newProm=new Promise((resolve,reject)=>{
		resolve(){
			needle().then((resp)=>{
				return coinId;
			})
		}
		reject(){
			
		}
	})

*/