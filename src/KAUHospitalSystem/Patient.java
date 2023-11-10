package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Patient extends Person
{
    private String illness;
    private String bloodGroup;
    private Doctor doctor;
    private Medicine[] medicine;
    private Room room;

    //construct with an args
    public Patient(String illness, String bloodGroup, int id, String name, String nationality, char gender, int phone, int totMedicine) 
    {
        super(id, name, nationality, gender, phone);
        this.illness = illness;
        this.bloodGroup = bloodGroup;
        this.medicine = new Medicine[totMedicine];
    }
    
    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------
    
    public int getTotalMedicine()
    {
        return medicine.length;
    }
    
    //--------------------------------------------------------------------------------------  

    public String getIllness() 
    {
        return illness;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setIllness(String illness) 
    {
        this.illness = illness;
    }
    
    //--------------------------------------------------------------------------------------  

    public String getBloodGroup() 
    {
        return bloodGroup;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setBloodGroup(String bloodGroup) 
    {
        this.bloodGroup = bloodGroup;
    }
    
    //--------------------------------------------------------------------------------------  

    public Doctor getDoctor() 
    {
        return doctor;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setDoctor(Doctor doctor) 
    {
        this.doctor = doctor;
    }
    
    //--------------------------------------------------------------------------------------  

    public Medicine getMedicine(int index) 
    {
        return medicine[index];
    }
    
    //--------------------------------------------------------------------------------------  

    public void setMedicine(Medicine medicine, int index) 
    {
        this.medicine[index] = medicine;
    }
    
    //--------------------------------------------------------------------------------------  

    public Room getRoom() 
    {
        return room;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setRoom(Room room) 
    {
        this.room = room;
    }
    
    //--------------------------------------------------------------------------------------  
    
    public double calTotalBill()
    {
        //calculate the total of the bill by adding all of the prices
        
        double total = 0;
        
        total+=doctor.getConsultationfees();
        total+=room.getCharges();
        for(int i =0; i < medicine.length; i++)
        {
            total+= medicine[i].getPrice();
        }
        
        return total;
    }
    
    //to string methods
    
    public String printPatientBasicInfo()
    {
        
        return super.toString()+
                "\n-------------------------------------------------------------------------------------------"
                +"\nIllness: " + illness + ", Blood Group: " + bloodGroup
              +"\n-------------------------------------------------------------------------------------------";
    }

    @Override
    public String toString() 
    {
        return "illness=" + illness + ", bloodGroup=" + bloodGroup + 
        ", doctor=" + doctor + ", medicine=" + medicine + ", room=" + room;
    }

}
