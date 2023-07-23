/**
 * @author (NIRAJ BOHARA )
 * @version (18.0.2)
 */
//IMPORT UTIL
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.font.*;
public class TransportGUI implements ActionListener
{
    //Creating instance variable for JLabel
    JFrame frame;
    
    JLabel  Vehicle,VehId, VehName,VehColor,VehSpeed,VehWeight ;
    JLabel  AutoRickshaw,EngDisp,Torq,NoOfSeats,FuelTcap,GroundClea,ChargeAmt,BookedDate;
    JLabel ElectricSco,Range,BatteryCap,Price,ChargeT,Brand,Mileage;
    
    //creating instance variable for JTextFeild 
    JTextField vIdText,VehNameText,VehColorText,VehSpeedText,VehWeightText;
    JTextField EngDisptext,Torqtext,NoOfSeatstext,FuelTcaptext,GroundCleatext,ChargeAmttext;
    JTextField Rangetext,BatteryCaptext,Pricetext,ChargeTtext,Brandtext,Mileagetext;
    
    //creating instance variables for Button
    JButton but1,but2,but3;
    JButton But1,But2,But3,But4;
    JButton Clear;
    
    //creating instance variable for combobox
    JComboBox  year,month,day;
    
    ArrayList<Vehicle> AlVehicle = new ArrayList<Vehicle>();
    
    public TransportGUI(){
        JFrame frame = new JFrame("TransportGUI");
        
        //creating Vehicle components  
        
        Vehicle =new JLabel("Vehicle Info→");
        Vehicle.setFont(new Font("arial", Font.BOLD, 20 ));
        VehId = new JLabel("VehicleID:");
        VehName = new JLabel("Vehicle Name:");
        VehColor=new JLabel("VehicleColor:");
        VehWeight=new JLabel("VehicleWeight:");
        VehSpeed= new JLabel("VehicleSpeed:");
        BookedDate= new JLabel("Booked Date:");
        vIdText= new JTextField();
        VehNameText= new JTextField();
        VehColorText= new JTextField();
        VehSpeedText= new JTextField();
        VehWeightText= new JTextField();
        
        //creating AutoRickShaw components
        
        AutoRickshaw=new JLabel("AutoRickshaw");
        AutoRickshaw.setFont(new Font("Verdana", Font.BOLD, 20 ));
        EngDisp=new JLabel("Engine Displacement:");
        Torq=new JLabel("Torque:");
        NoOfSeats=new JLabel("No of seats:");
        FuelTcap=new JLabel("Fuel tank capacity:");
        GroundClea=new JLabel("Ground Clearance:");
        ChargeAmt=new JLabel("Charge Amount:");
        EngDisptext= new JTextField();
        Torqtext= new JTextField();
        NoOfSeatstext= new JTextField();
        FuelTcaptext= new JTextField();
        GroundCleatext= new JTextField();
        ChargeAmttext= new JTextField();
        but1=new JButton("Add");
        but2= new JButton("Book");
        but3= new JButton("Display");
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        
        
        String Day [] = {"Day", "1","2","3","4","5","6","7","8","9","10","11","12 ","13",
        "14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String Month [] = {"Month", "January","Febuarary","March","April","May","June","July","August","September","October","November","December"};
        String Year [] = {"Year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        
        year= new JComboBox(Year);
        month = new JComboBox(Month);
        day = new JComboBox(Day);
        
        //creating ElectricScotter components  
        ElectricSco=new JLabel("ElectricScooter");
        ElectricSco.setFont(new Font("Verdana", Font.BOLD, 20 ));
        Range=new JLabel("Range:");
        BatteryCap= new JLabel("Battery Capacity:");
        Price=new JLabel("Price:");
        ChargeT=new JLabel("Charging Time:");
        Brand=new JLabel("Brand:");
        Mileage=new JLabel("Mileage:");
        Rangetext= new JTextField();
        BatteryCaptext= new JTextField();
        Pricetext= new JTextField();
        ChargeTtext= new JTextField();
        Brandtext= new JTextField();
        Mileagetext= new JTextField();
        But1= new JButton("Add");
        But2= new JButton("Sell");
        But3= new JButton("Purchase");
        But4= new JButton("Display");
        But1.addActionListener(this);
        But2.addActionListener(this);
        But3.addActionListener(this);
        But4.addActionListener(this);
        
        Clear=new JButton("Clear");
        Clear.addActionListener(this);
        
        //Vehicle SetBounds
        Vehicle.setBounds(17,92,134,25);
        VehId.setBounds(197,49,65,20);
        VehName.setBounds(197,80,91,20);
        VehColor.setBounds(197,111,87,20);
        VehWeight.setBounds(197,142,97,20);
        VehSpeed.setBounds(197,173,94,20);
        vIdText.setBounds(313,49,217,19);
        VehNameText.setBounds(313,80,217,19);
        VehColorText.setBounds(313,111,217,19);
        VehSpeedText.setBounds(313,142,217,19);
        VehWeightText.setBounds(313,173,217,19);
        BookedDate.setBounds(24,472,81,20);
        
        //AutoRickshaw SetBounds
        AutoRickshaw.setBounds(35,247,180,20);
        EngDisp.setBounds(24,295,137,20);
        Torq.setBounds(24,323,47,20);
        NoOfSeats.setBounds(24,379,77,20);
        FuelTcap.setBounds(24,351,123,20);
        GroundClea.setBounds(284,295,119,15);
        ChargeAmt.setBounds(284,323,102,20);
        EngDisptext.setBounds(167,295,95,21);
        Torqtext.setBounds(167,323,95,21);
        NoOfSeatstext.setBounds(167,379,95,21);
        FuelTcaptext.setBounds(167,351,95,21);
        GroundCleatext.setBounds(409,295,95,21);
        ChargeAmttext.setBounds(408,323,95,21);
        but1.setBounds(197,504,84,27);
        but2.setBounds(197,546,84,27);
        but3.setBounds(197,588,84,27);
        year.setBounds(24,498,93,33);
        month.setBounds(24,540,93,33);
        day.setBounds(24,582,93,33);
        
        //ElectricScotter SetBounds
        ElectricSco.setBounds(544,247,180,20);
        Range.setBounds(548,295,45,20);
        BatteryCap.setBounds(548,323,107,20);
        Price.setBounds(548,351,36,20);
        Brand.setBounds(548,379,412,20);
        ChargeT.setBounds(775,293,95,20);
        Mileage.setBounds(777,322,55,20);
        Rangetext.setBounds(659,294,95,21);
        BatteryCaptext.setBounds(659,322,95,21);
        Pricetext.setBounds(659,350,95,21);
        Brandtext.setBounds(659,378,95,21);
        ChargeTtext.setBounds(880,293,95,21);
        Mileagetext.setBounds(880,322,95,21);
        But1.setBounds(548,504,84,27);
        But2.setBounds(646,504,84,27);
        But3.setBounds(744,504,90,27);
        But4.setBounds(842,504,84,27);
        
        Clear.setBounds(408,608,96,25);

        //Ddding to frame of vehicle
        frame.add(Vehicle);
        frame.add(VehId);
        frame.add(VehName);
        frame.add(VehSpeed);
        frame.add(VehWeight);
        frame.add(VehColor);
        frame.add(vIdText);
        frame.add(VehNameText);
        frame.add(VehColorText);
        frame.add(VehSpeedText);
        frame.add(VehWeightText);
        frame.add(BookedDate);
        
        //Adding to frame of AutoRickshaw
        frame.add(AutoRickshaw);
        frame.add(EngDisp);
        frame.add(Torq);
        frame.add(NoOfSeats);
        frame.add(FuelTcap);
        frame.add(GroundClea);
        frame.add(ChargeAmt);
        frame.add(EngDisptext);
        frame.add(Torqtext);
        frame.add(NoOfSeatstext);
        frame.add(FuelTcaptext);
        frame.add(GroundCleatext);
        frame.add(ChargeAmttext);
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(year);
        frame.add(day);
        frame.add(month);
                
        //Adding to Frame of ElectricScotter
        frame.add(ElectricSco);
        frame.add(Range);
        frame.add(BatteryCap);
        frame.add(Price);
        frame.add(ChargeT);
        frame.add(Brand);
        frame.add(Mileage);
        frame.add(Rangetext);
        frame.add(BatteryCaptext);
        frame.add(Pricetext);
        frame.add(ChargeTtext);
        frame.add(Brandtext);
        frame.add(Mileagetext);
        frame.add(But1);
        frame.add(But2);
        frame.add(But3);
        frame.add(But4);
        
        frame.add(Clear);
        frame.setSize(1020,700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#a08bcc"));
        frame.setResizable(false);

    }

public static void main (String[]args){
        TransportGUI obj = new TransportGUI();
       
    }
    // creating functionality of Add button of Autorickshaw
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == but1){
            try{
                int vehicleId = Integer.parseInt(vIdText.getText());
                String vehicleName = VehNameText.getText();
                String vehicleColor =  VehColorText.getText();
                String vehicleSpeed = VehSpeedText.getText();
                String vehicleWeight = VehWeightText.getText();
                
                int engineDisplacement =Integer.parseInt(EngDisptext.getText());
                String torque = Torqtext.getText();
                int fuelTankCapacity = Integer.parseInt(FuelTcaptext.getText());
                String groundClearance = GroundCleatext.getText();
                
                boolean isAdded=false;

                AutoRickshaw adding_Auto = new AutoRickshaw(vehicleId,vehicleName,vehicleWeight,vehicleSpeed,vehicleColor,engineDisplacement,torque,fuelTankCapacity,groundClearance);

                if(AlVehicle.isEmpty()){
                    if(vehicleName.isEmpty() || vehicleWeight.isEmpty() || vehicleSpeed.isEmpty() || vehicleColor.isEmpty()|| torque.isEmpty() ||
                    groundClearance.isEmpty()){
                        JOptionPane.showMessageDialog(frame,"Field Empty :(");
                    }
                    else{
                        AlVehicle.add(adding_Auto);
                        JOptionPane.showMessageDialog(frame,"Added Succesfully!");
                    }
                }
                else{
                    for(Vehicle V : AlVehicle){
                        if(V instanceof AutoRickshaw){
                            if(vehicleId == V.getvehicleID()){
                                JOptionPane.showMessageDialog(frame," Matching vehicle ID exists already");
                                isAdded = false;
                                break;
                            }
                            else{
                                isAdded = true;
                            }
                        }
                        else{
                            isAdded=true;
                        }
                    }

                    if(isAdded == true){
                        AlVehicle.add(adding_Auto);
                        JOptionPane.showMessageDialog(frame,"Added Succesfully!");
                        isAdded = false;
                    }
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Input Invalid!");
            }
        }
        //Autorickshaw Display button
        if(e.getSource() == but3){
            if(AlVehicle.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Enter Values!!! Can't Display");
            }
            else{
                for(Vehicle adding_Auto : AlVehicle){
                    if(adding_Auto instanceof AutoRickshaw){
                         AutoRickshaw display = (AutoRickshaw) adding_Auto;
                        display.display();  
                    }                    
                }
            }
        }
        //AutoRickshaw Book button
        if(e.getSource() == but2){
            try{
                int vehicleId = Integer.parseInt(vIdText.getText());
                String bookedDate = (String)year.getSelectedItem()+ (String)month.getSelectedItem()+(String)day.getSelectedItem();
                int chargeAmount = Integer.parseInt(ChargeTtext.getText());
                int numberOfSeats = Integer.parseInt(NoOfSeatstext.getText());

                boolean hasBooked = false;
                boolean bought = false;

                if(AlVehicle.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Vehicle ID Absent");
                }
                else{                  
                    for(Vehicle object: AlVehicle){
                        if(object instanceof AutoRickshaw){
                            if(vehicleId == object.getvehicleID()){
                                if(((AutoRickshaw)object).getIsBooked() == false){
                                    ((AutoRickshaw)object).book(bookedDate,chargeAmount,numberOfSeats);
                                    JOptionPane.showMessageDialog(frame," The Auto Rickshaw` Has been booked");
                                    hasBooked = false;
                                    bought = true;
                                    break;
                                }
                                else{
                                    hasBooked = true;
                                    bought = false;
                                    JOptionPane.showMessageDialog(frame,"The Auto Rickshaw has already been  Booked");
                                }
                            }else{
                                bought = false;
                            }
                        }
                        else{
                            bought = false;
                        }
                    }
                    if(bought == false && hasBooked == false){
                        JOptionPane.showMessageDialog(frame,"Vehicle ID absent");
                        bought = true;
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Correct the input");
            }
        }
        //Electric Scooter Add button

        if(e.getSource() == But1){
            try{

                String vehicleName = VehNameText.getText();
                int vehicleId = Integer.parseInt(vIdText.getText());
                String vehicleWeight = VehWeightText.getText();
                String vehicleSpeed = VehSpeedText.getText();
                String vehicleColor =  VehColorText.getText();

                int batteryCapacity = Integer.parseInt(BatteryCaptext.getText());

                boolean isAdded=false;
                Electric_Scooter adding_elc =new Electric_Scooter(vehicleId, vehicleName, vehicleWeight, vehicleSpeed,vehicleColor,batteryCapacity);
                if(AlVehicle.isEmpty()){
                    if(vehicleName.isEmpty() || vehicleWeight.isEmpty() || vehicleSpeed.isEmpty() || vehicleColor.isEmpty()){
                        JOptionPane.showMessageDialog(frame,"Field Empty!!!");
                    }

                    else{
                        AlVehicle.add(adding_elc);
                        JOptionPane.showMessageDialog(frame,"Added Succesfully!!");
                    }
                }

                else{
                    for(Vehicle A : AlVehicle){
                        if(A instanceof Electric_Scooter){
                              if(vehicleId == A.getvehicleID()){
                                JOptionPane.showMessageDialog(frame,"Matching VehicleID already Exists");
                                isAdded = false;
                                break;
                            }
                            else{
                                isAdded = true;
                            }
                        }
                        else{
                            isAdded = true;
                        }
                    }
           
                    if(isAdded == true){
                        AlVehicle.add(adding_elc);
                        JOptionPane.showMessageDialog(frame,"Added Successfully ");
                        isAdded = false;
                    }
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Input Invalid !!!");
            }
        }
        //Display of Electric Scooter
        if(e.getSource() == But4){
            if(AlVehicle.isEmpty()){
                JOptionPane.showMessageDialog(frame,"Can't Display Enter Values!!! ");
            }
            else{
                for(Vehicle adding_elc : AlVehicle){
                    if(adding_elc instanceof Electric_Scooter){
                        Electric_Scooter display = (Electric_Scooter)adding_elc;
                        display.display();
                    }
                }
            }
        }

        //Electric Scooter purchase button
        if(e.getSource() == But3){
            try{
                int vehicleId = Integer.parseInt(vIdText.getText());
                String brand = Brandtext.getText();
                int price = Integer.parseInt(Pricetext.getText());
                String chargingTime = ChargeTtext.getText();
                String mileage = Mileagetext.getText();
                int range = Integer.parseInt(Rangetext.getText());

                boolean hasPurchased=false;
                boolean buy=false;

                if(AlVehicle.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Vehicle ID Absent");
                }
                else{                  
                    for(Vehicle object: AlVehicle){
                        if(object instanceof Electric_Scooter){
                            if(vehicleId == object.getvehicleID()){
                                if(((Electric_Scooter)object).getHasPurchased() == false){
                                    ((Electric_Scooter)object).Purchase(brand, price, chargingTime, mileage, range);
                                    JOptionPane.showMessageDialog(frame," The ElectricScooter Has Been Purchased");
                                    hasPurchased=false;
                                    buy=false;
                                    break;
                                }
                                else{
                                    hasPurchased=false;
                                    buy=false;
                                    JOptionPane.showMessageDialog(frame,"ElectricScooter has already been Purchased");
                                }
                            }else{
                                buy=false;
                            }
                        }
                        else{
                            buy=false;
                        }
                    }
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Invalid input");
            }
        }
        //Electric Scooter Sell button
        if(e.getSource() == But2){
            try{
                int vehicleId = Integer.parseInt(vIdText.getText());

                int price = Integer.parseInt(Pricetext.getText());

                boolean HasSold= false;
                boolean given= false;

                if(AlVehicle.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Vehicle ID Absent");
                   
                }
                else{                  
                    for(Vehicle object: AlVehicle){
                        if(object instanceof Electric_Scooter){
                            if(vehicleId == object.getvehicleID()){
                                if(((Electric_Scooter)object).getHasSold() == false){
                                    ((Electric_Scooter)object).sell(price);
                                    JOptionPane.showMessageDialog(frame," The ElectricScooter Has been Sold");
                                    HasSold= false;
                                    given= false;
                                    break;

                                }
                                else{
                                    HasSold= false;
                                    given= false;
                                    JOptionPane.showMessageDialog(frame,"ElectricScooter has already been sold");
                                }
                            }else{
                                given=false;
                            }
                        }
                        else{
                            given=false;
                        }
                    }

                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame,"Correct the input");
            }
        }
        //Clear Button
        if(e.getSource()==Clear){
             //Vehicle Clear Button 
             VehNameText.setText("");
             vIdText.setText("");
             VehColorText.setText("");
             VehSpeedText.setText("");
             VehWeightText.setText("");
           
             //AutoRickshaw clear button
             EngDisptext.setText("");
             Torqtext.setText("");
             NoOfSeatstext.setText("");
             FuelTcaptext.setText("");
             GroundCleatext.setText("");
             ChargeAmttext.setText("");
             
             //Electric Scooter Clear button
             
             ElectricSco.setText("");
             Range.setText("");
             BatteryCap.setText("");
             Price.setText("");
             ChargeT.setText("");
             Brand.setText("");
             Mileage.setText("");
             
             
        }
    }

}
