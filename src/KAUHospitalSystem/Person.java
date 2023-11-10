package KAUHospitalSystem;

/**
 *
 * @author hebahturki
 */
public class Person implements Comparable <Person>
{
    int id;
    String name;
    String nationality;
    char gender;
    int phone;

    //construct with an args 
    public Person(int id, String name, String nationality, char gender, int phone) 
    {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.phone = phone;
    }
    
    //-----------------------------------Setter and Getter for every data field in the class--------------------------------------------- 
    
    public int getId() 
    {
        return id;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setId(int id) 
    {
        this.id = id;
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

    public String getNationality() 
    {
        return nationality;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }
    
    //-------------------------------------------------------------------------------------- 

    public char getGender() 
    {
        return gender;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setGender(char gender) 
    {
        this.gender = gender;
    }
    
    //-------------------------------------------------------------------------------------- 

    public int getPhone() 
    {
        return phone;
    }
    
    //-------------------------------------------------------------------------------------- 

    public void setPhone(int phone) 
    {
        this.phone = phone;
    }
    
    //-------------------------------------------------------------------------------------- 
    
    //override the method compareTo from the interface Comparable
    @Override
    public int compareTo(Person person)
    {
        if(id < person.getId())
        {
            return -1;
        }
        else if(id > person.getId())
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
    
    //to string method

    @Override
    public String toString() 
    {
        return "\tID: " + id + "\n\tName: " + name + "\n\tNationality :" 
        + nationality + "\n\tGender: " + gender + "\n\tPhone: " + phone;
    }
    

}
