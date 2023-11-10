package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Doctor extends Staff
{
    private double consultationfees;

    //construct with an args
    public Doctor(double consultationfees, String specialization, String staffid,
            int id, String name, String nationality, char gender, int phone) 
    {
        super(specialization, staffid, id, name, nationality, gender, phone);
        this.consultationfees = consultationfees;
    }
    
    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------   

    public double getConsultationfees() 
    {
        return consultationfees;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setConsultationfees(double consultationfees) 
    {
        this.consultationfees = consultationfees;
    }
    
    //-------------------------------------------------------------------------------------- 

    //to string method
    @Override
    public String toString() 
    {
        return super.toString()+"\n\tConsultation Fees :" + consultationfees;
    }

}
