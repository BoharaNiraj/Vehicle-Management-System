/**
 * @author (NIRAJ BOHARA )
 * @version (18.0.2)
 */
public class AutoRickshaw extends Vehicle{
    //declaring the variable in AutoRickshaw class
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    public AutoRickshaw(int vehicleID, String vehicleName,String vehicleWeight,String vehicleSpeed,
    String vehicleColor,int engineDisplacement,String torque,int fuelTankCapacity,String groundClearance){
        super (vehicleID,vehicleName,vehicleWeight,vehicleColor);
        super.setvehicleSpeed(vehicleSpeed);                                    
        super.setvehicleColor(vehicleColor);
        this.engineDisplacement=engineDisplacement;
        this.torque=torque;
        this.fuelTankCapacity=fuelTankCapacity;
        this.groundClearance=groundClearance;
        this.isBooked=false;
    }
    //getter method
    public int getengineDisplacement(){
        return this.engineDisplacement;
    }

    public String getTorque(){
        return this.torque;
    }

    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public int getFuelTankCapacity(){
        return this.fuelTankCapacity;
    }

    public String getGroundClearance(){
        return this.groundClearance;
    }

    public int getChargeAmount(){
        return this.chargeAmount;
    }

    public String getBookedDate(){
        return this.bookedDate;
    }

    public boolean getIsBooked(){
        return this.isBooked;
    }
    //setter method
    public void setChargeAmount(int newChargeAmount){
        this.chargeAmount=newChargeAmount;
    }

    public void setNumberOfSeats(int newNumberOfSeats){
        this.numberOfSeats=newNumberOfSeats;
    }                          
    //creating a book method
    public void book(String bookDate,int chargeAmount,int numberOfSeats){
        if (isBooked==false){
            this.bookedDate=bookDate;
            //calling setters
            setChargeAmount(chargeAmount);
            setNumberOfSeats(numberOfSeats);
            isBooked=true;
            System.out.println("The vehicle is booked"+ getvehicleID());
        }if(isBooked==true){
            System.out.println("We are sorry, the autorickshaw is already booked");
        }
    }
    //creating a display method
    public void display(){
        super.display();
        if(isBooked == true){
            System.out.println("The Engine Displacement is:"+ engineDisplacement);
            System.out.println("The Torque is:" +torque);
            System.out.println("The Fuel Tank Capacity is:"+fuelTankCapacity);
            System.out.println("The Ground clearance is:"+ groundClearance);
            System.out.println("It was booked on :"+ bookedDate);
        }

        if (chargeAmount == 0){
            System.out.println("The charge amount is null");
        }else{
            System.out.println("The charge amount will be"+this.chargeAmount);
        }

        // for no of seats
        if (numberOfSeats == 0){
            System.out.println("The number of seats is null");
        }else {
            System.out.println("The number of seats will be" +this.numberOfSeats);}
    }
}