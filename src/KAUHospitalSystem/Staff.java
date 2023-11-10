package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public abstract class Staff extends Person
{
    private String specialization;
    private String staffid;

    //construct with an args
    public Staff(String specialization, String staffid, int id,
            String name, String nationality, char gender, int phone) 
    {
        super(id, name, nationality, gender, phone);
        this.specialization = specialization;
        this.staffid = staffid;
    }
    
    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------  

    public String getSpecialization() 
    {
        return specialization;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }
    
    //--------------------------------------------------------------------------------------  

    public String getStaffid() 
    {
        return staffid;
    }
    
    //--------------------------------------------------------------------------------------  

    public void setStaffid(String staffid) 
    {
        this.staffid = staffid;
    }
    
    //--------------------------------------------------------------------------------------  

    //to string method
    @Override
    public String toString() 
    {
        return super.toString()+"\n\tSpecilaization: " + specialization + "\n\tStaff ID: " + staffid;
    }
    
}
