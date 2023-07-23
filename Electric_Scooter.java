/**
 * @author (NIRAJ BOHARA )
 * @version (18.0.2)
 */
//creating a class  Electric_Scooter
public class Electric_Scooter extends Vehicle{
    // defining  attributes in the class
    private int range,batteryCapacity,price;
    private String chargingTime,brand,mileage;
    private boolean hasPurchased,hasSold;
    //creating constructor
    public Electric_Scooter(int vehicleID,String vehicleName,String vehicleWeight,
    String vehicleSpeed,String vehicleColor,int batteryCapacity){
        //setting the value of parameters
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor);
        super.setvehicleSpeed(vehicleSpeed);
        super.setvehicleColor(vehicleColor);
        this.batteryCapacity=batteryCapacity;
        this.price=0;
        this.range=0;
        this.brand="";
        this.mileage="";
        this.chargingTime="";
        this.hasPurchased=false;
        this.hasSold=false;
    }
    //Acessor method
    //getter method
    public int getbattery(){
        return this.batteryCapacity;
    }
   
    public int getPrice(){
        return this.price;
    }

    public int getRange(){
        return this.range;
    }
   
    public String getBrand(){
        return this.brand;
    }

    public String getMileage(){
        return this.mileage;
    }
   
    public String getchargingtime(){
        return this.chargingTime;
    }
   
    public boolean getHasSold(){
        return this.hasSold;
    }
   
    public boolean getHasPurchased(){
        return this.hasPurchased;
    }
   
   
    //setter to set new Brand

    public void setBrand(String newbrand){
        if(this.hasPurchased==false){
            this.brand=newbrand;//accept new brand as a paramter
        }
        else{
        System.out.println("It is not possble to change the brand");
       }
   
    }

    //creating method to introduct the product

    public void Purchase(String brand,int price,String chargingTime,String mileage,int range){
    if(this.hasPurchased==false){
        setBrand("brandName");//set parameter as brandName
        this.price=price;
        this.chargingTime=chargingTime;
        this.mileage=mileage;
        this.range=range;
        this.hasPurchased=true;}
    }
    //creaitng method for selling
   
    public void sell (int newPrice){
       if(this.hasSold==false){
          this.price=newPrice;
          this.range=0;
          this.chargingTime="";
          this.mileage="";
          this.batteryCapacity=0;
          this.hasSold=true;
          this.hasPurchased=false;
        }
       
        if (this.hasSold=true){
          System.out.println("The scooter has already sold");
        }
   
    }
    //creating a Display method
    public void display(){
        super.display();
        if(hasPurchased==true){
            System.out.println("Brand is:"+this.brand);
            System.out.println("Battery capacity is:"+this.batteryCapacity);
            System.out.println("Mileage  is:"+this.mileage);
            System.out.println("range is:"+this.range);
            System.out.println("Recharge  time is:"+this.chargingTime);
            System.out.println("-----------");  
        }
    }
}  