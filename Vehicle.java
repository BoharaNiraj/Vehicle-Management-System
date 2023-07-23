/**
 * @author (NIRAJ BOHARA )
 * @version (18.0.2)
 */
//creating a parent class :vehicle
public class Vehicle
{
    //Declaring the attributes;
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    // creating the constructor of vehicle class
    public Vehicle(int vehicleID, String vehicleName,String vehicleWeight,String vehicleColor){
        this.vehicleID=vehicleID;
        this.vehicleName=vehicleName;
        this.vehicleWeight=vehicleWeight;
        this.vehicleColor=vehicleColor;
    }
    //Acessor method(Getter)
    //getter for VehicleID
    public int getvehicleID(){
        return this.vehicleID;
    }
    //getter method for vehicleName
    public String getvehicleName(){
        return this.vehicleName;
    }
    //getter method for vehicleWeight
    public String getvehicleWeight(){
        return this.vehicleWeight;
    }
    //getter method for vehicleColor
    public String getvehicleColor(){
        return this.vehicleColor;
    }
    //getter method for vehicleSpeed
    public  String getvehicleSpeed(){
        return this.vehicleSpeed;
    }
    //setter methods for new speed
    public void setvehicleSpeed(String newSpeed){
        this.vehicleSpeed=newSpeed;
    }
    //setter method for new color
    public void  setvehicleColor(String newcolor)
    {
        this.vehicleColor=newcolor;
    }
    //display method to display all the values of attributes
    public void display(){
        System.out.println("The Vehicle ID is" + this.vehicleID);
        System.out.println("The name of vehicle is" + this.vehicleName);
        System.out.println("The speed of vehicle is" + this.vehicleSpeed);
        System.out.println("The color of vehicle is" + this.vehicleColor);
        if(this.vehicleWeight==""){
            System.out.println("The vehicle weight is empty");
        }else{
            System.out.println("The vehicle weight is" +this.vehicleWeight);

        }

    }
}