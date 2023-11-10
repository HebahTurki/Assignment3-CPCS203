package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Room 
{
    private int roomNo;
    private String floor;
    private String block;
    private double charges;

    //construct with an args
    public Room(int roomNo, String floor, String block, double charges) 
    {
        this.roomNo = roomNo;
        this.floor = floor;
        this.block = block;
        this.charges = charges;
    }

    //-----------------------------------Setter and Getter for every data field in the class---------------------------------------------  
    
    public int getRoomNo() 
    {
        return roomNo;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setRoomNo(int roomNo) 
    {
        this.roomNo = roomNo;
    }
    
    //-------------------------------------------------------------------------------------- 

    public String getFloor() 
    {
        return floor;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setFloor(String floor) 
    {
        this.floor = floor;
    }

    //-------------------------------------------------------------------------------------- 
    
    public String getBlock() 
    {
        return block;
    }

    //-------------------------------------------------------------------------------------- 
    
    public void setBlock(String block) 
    {
        this.block = block;
    }

    //-------------------------------------------------------------------------------------- 
    
    public double getCharges() 
    {
        return charges;
    }

    //-------------------------------------------------------------------------------------- 
    
    public void setCharges(double charges) 
    {
        this.charges = charges;
    }

    //-------------------------------------------------------------------------------------- 
    
    //to string method
    @Override
    public String toString()
    {
        return "\tRoom No: " + roomNo + "\n\tLocated in floor: " + floor + "\n\tBlock :" + block + "\n\tCharges: " + charges;
    }
    
}
