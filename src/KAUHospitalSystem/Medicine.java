package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Medicine 
{
    private int medicineCode;
    private String name;
    private double price;

    //construct with an args
    public Medicine(int medicineCode, String name, double price) 
    {
        this.medicineCode = medicineCode;
        this.name = name;
        this.price = price;
    }
    
    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------  

    public int getMedicineCode()
    {
        return medicineCode;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setMedicineCode(int medicineCode)
    {
        this.medicineCode = medicineCode;
    }
    
    //-------------------------------------------------------------------------------------- 

    public String getName() 
    {
        return name;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setName(String name) 
    {
        this.name = name;
    }
    
    //-------------------------------------------------------------------------------------- 

    public double getPrice() 
    {
        return price;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setPrice(double price) 
    {
        this.price = price;
    }

    //-------------------------------------------------------------------------------------- 
    
    //to string method
    @Override
    public String toString() 
    {
        return "\tMedicine Code: " + medicineCode + "\n\tName: " + name + "\n\tPrice :" + price;
    }

}
