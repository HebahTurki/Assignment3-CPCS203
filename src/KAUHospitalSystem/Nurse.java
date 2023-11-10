package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Nurse extends Staff
{
    private int experience;

    //construct with an args
    public Nurse(int experience, String specialization, String staffid,
            int id, String name, String nationality, char gender, int phone) 
    {
        super(specialization, staffid, id, name, nationality, gender, phone);
        this.experience = experience;
    }

    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------  
    
    public int getExperience() 
    {
        return experience;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    
    //-------------------------------------------------------------------------------------- 

    //to string method
    @Override
    public String toString() 
    {
        return super.toString()+"\n\tExperience Year: " + experience;
    }
    
    
}
