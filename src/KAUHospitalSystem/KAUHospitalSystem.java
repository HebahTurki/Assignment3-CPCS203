package KAUHospitalSystem;

import java.util.*;
import java.io.*;
/*
 Name : Hebah Turki Alahmari 
 IDs : 2105304
 Section : BBR
 course name : CPCS203
 Assignment#3
 */
public class KAUHospitalSystem 
{
    //method to create patient object
    private static Patient getPatientRecord(Scanner in)
    {
        String illness = in.next();
        String bloodg = in.next();
        int id = in.nextInt();
        String Dname = in.next();
        String nationality = in.next();
        char gender = in.next().charAt(0);
        int phone = in.nextInt();
        int totalMed = in.nextInt();
        Patient Patient = new Patient(illness, bloodg, id, Dname, nationality, gender, phone, totalMed);
                
        return Patient;
    }
    
    //--------------------------------------------------------------------------------------
      
    //method to create doctor object
    private static Doctor getDoctor(Scanner in)
    {
        double CF = in.nextDouble();
        String specialization = in.next();
        String staffid = in.next();
        int id = in.nextInt();
        String Dname = in.next();
        String nationality = in.next();
        char gender = in.next().charAt(0);
        int phone = in.nextInt();
        Doctor doctor = new Doctor(CF, staffid, specialization, id, Dname, nationality, gender, phone);
        
        return doctor;
    }
    
    //--------------------------------------------------------------------------------------
    
    //method to create nurse object
    private static Nurse getNurse(Scanner in)
    {
        int experience = in.nextInt();
        String specialization = in.next();
        String staffid = in.next();
        int id = in.nextInt();
        String Dname = in.next();
        String nationality = in.next();
        char gender = in.next().charAt(0);
        int phone = in.nextInt();
        Nurse nurse = new Nurse(experience, staffid, specialization, id, Dname, nationality, gender, phone);
        
        return nurse;
    }
    
    //--------------------------------------------------------------------------------------
    
    //method to create room object
    private static Room getRoom(Scanner in)
    {
        int num = in.nextInt();
        String floor = in.next();
        String block = in.next();
        double charge = in.nextDouble();
        Room room = new Room(num, floor, block, charge);
                  
        
        return room;
    }
    
    //--------------------------------------------------------------------------------------
    
    //method to create Medicine object
    private static Medicine getMedicineRecord(Scanner in)
    {
        int code = in.nextInt();
        String name = in.next();
        double price = in.nextDouble();
        Medicine medicine = new Medicine(code, name, price);
                  
        
        return medicine;
    }
    
    //--------------------------------------------------------------------------------------
    
    public static void main(String[] args) throws FileNotFoundException 
    {
        //Open the input File & reading the data.
        File fileInput = new File("/Users/hebahturki/NetBeansProjects/Hebah2105304KAUHospitalSystem/input(1).txt");
        
        //Check if the files exists.
        if (!fileInput.exists())
        {
            System.out.println("File " + fileInput.getName() + " doesn't exist");
            System.exit(0);
        }
        File fileOutput = new File("Output.txt");
        
        Scanner Fileread = new Scanner(fileInput); //Make Scanners for input File.
        PrintWriter filePin = new PrintWriter(fileOutput); //Creating fileWriter to write in the File.
        
        //input the number of room, medicine, and person objects.
        int roomIndex = Fileread.nextInt();
        int medicineIndex = Fileread.nextInt();
        int personIndex = Fileread.nextInt();
        
        //Create the required arrays.
        Room[] HRooms = new Room[roomIndex]; //rooms array
        Medicine[] HMedicines = new Medicine[medicineIndex]; //medicine array
        Person[] HPersons = new Person[personIndex]; //person array
        
        filePin.println("--------------- Welcome to KAU Hospital System ---------------");
        
        //create the commands.
        String command =null;
        int emptyi;
        do
        {
            command = Fileread.next();
            
            if(command.equalsIgnoreCase("Add_Room"))
            {
                filePin.print("Command " + command + ":");
                filePin.println(" Add a new room record in the System");
                
                //check if the index empty then save the object in
                emptyi = -1;
                for(int i =0; i < HRooms.length; i++)
                {
                    if(HRooms[i] == null)
                    {
                        emptyi = i;
                        break;
                    }
                }
                
                //create room object
                HRooms[emptyi] = getRoom(Fileread);
                
                //print room array content.
                filePin.println(HRooms[emptyi].toString()+"\n");
                filePin.println("----------------------------------------------------------------");
            }
            
            else if(command.equalsIgnoreCase("Add_Medicine"))
            {
                filePin.print("Command " + command + ":");
                filePin.println(" Add a new Medicine record in the System");
                
                //check if the index empty then save the object in
                emptyi = -1;
                for(int i =0; i < HMedicines.length; i++)
                {
                    if(HMedicines[i] == null)
                    {
                        emptyi = i;
                        break;
                    }
                }
                
                //create Medicine object
                HMedicines[emptyi] = getMedicineRecord(Fileread);
                
                //print Medicine array content
                filePin.println(HMedicines[emptyi].toString()+"\n");
                filePin.println("----------------------------------------------------------------");
            }
            
            else if(command.equalsIgnoreCase("Add_Doctor"))
            {
                filePin.print("Command " + command + ":");
                filePin.println(" Add a new doctor record in the System");
                  
                //check if the index empty then save the object in
                emptyi = -1;
                for(int i =0; i < HPersons.length; i++)
                {
                    if(HPersons[i] == null)
                    {
                        emptyi = i;
                        break;
                    }
                }
                  
                //create doctor object
                HPersons[emptyi] = getDoctor(Fileread);
                
                //print person array content
                filePin.println(HPersons[emptyi].toString()+"\n");
                filePin.println("----------------------------------------------------------------");
            }
            
            else if(command.equalsIgnoreCase("Add_Nurse"))
            {
                filePin.print("Command " + command + ":");
                filePin.println(" Add a new nurse record in the System");
                  
                //check if the index empty then save the object in
                emptyi = -1;
                for(int i =0; i < HPersons.length; i++)
                {
                    if(HPersons[i] == null)
                    {
                        emptyi = i;
                        break;
                    }
                }
                 
                //create nurse object
                HPersons[emptyi] = getNurse(Fileread);
                
                //print person array content
                filePin.println(HPersons[emptyi].toString()+"\n");
                filePin.println("----------------------------------------------------------------");
            }
            
            else if(command.equalsIgnoreCase("Add_Patient"))
            {
                filePin.print("Command " + command + ":");
                filePin.println(" \nAdd a new Patient record in the System");
                  
                //check if the index empty then save the object in
                emptyi = -1;
                for(int i =0; i < HPersons.length; i++)
                {
                    if(HPersons[i] == null)
                    {
                        emptyi = i;
                        break;
                    }
                }
                
                //create patient object
                HPersons[emptyi] = getPatientRecord(Fileread);
                
                //print person array content
                filePin.println(((Patient)HPersons[emptyi]).printPatientBasicInfo()+"\n");
                filePin.println("-------------------------------------------------------------------------------");
            }
            
            else if(command.equalsIgnoreCase("Assign_Doctor_Patient"))
            {
                filePin.print("Command " + command + ":");
                
                int doctorID = Fileread.nextInt(); //read the doctorID from the file
                int patientID = Fileread.nextInt(); //read the patientID from the file
                Doctor doctor = null;
                Patient patient = null;
                
                for (Person HPerson : HPersons)
                {
                    //search for doctor object with the same ID
                    if (doctorID == HPerson.getId()) 
                    {
                        if(HPerson instanceof Doctor)
                        {
                            doctor = ((Doctor)HPerson);
                        }
                    }
                    
                    //search for Patient object with the same ID
                    if (patientID == HPerson.getId()) 
                    {
                        if(HPerson instanceof Patient)
                        {
                            patient = ((Patient)HPerson);
                        }
                    }
                    
                }
                
                //print the result of Assigning Doctor to Patient
                if(doctor == null)
                {
                    filePin.println("\nDoctor "+doctorID+" NOT FOUND ");
                    filePin.println("-------------------------------------------------------------------------------");
                }
                    
                else if(patient == null)
                {
                    filePin.println("\nPatient "+patientID+" NOT FOUND ");
                    filePin.println("-------------------------------------------------------------------------------");
                }
                
                else
                {
                    //add the doctor object to patient object
                    patient.setDoctor(doctor);
                    
                    filePin.print("\nSuccessfully Processed by the System:");
                    filePin.println("\nFollowing are the details:");
                    filePin.println("\t\tPatient: "+patient.getName()+"\n\t\tAssigned to Doctor: "+doctor.getName());
                    filePin.println("-------------------------------------------------------------------------------");
                }
            }
            
            if(command.equalsIgnoreCase("Assign_Room_Patient"))
            {
                filePin.print("Command " + command + ":");
                Room room = null;
                Patient patient = null;
                int roomNum = Fileread.nextInt(); //read the room number from the file
                int patientID = Fileread.nextInt(); //read the patientID from the file
                
                for (Person HPerson : HPersons)
                {
                    //search for Patient object with the same ID
                    if (patientID == HPerson.getId()) 
                    {
                        if(HPerson instanceof Patient)
                        {
                            patient = ((Patient)HPerson);
                            break;
                        }
                    }   
                }
                
                for (Room HRoom : HRooms)
                {
                    //search for room object with the same number
                    if (roomNum == HRoom.getRoomNo()) 
                    {
                        room = HRoom;
                    }
                }
                
                //print the result of Assigning room to Patient
                if(room == null)
                {
                    filePin.println("\nRoom "+roomNum+" NOT FOUND ");
                    filePin.println("---------------------------------------------------------------------------------");
                }
                    
                else if(patient == null)
                {
                    filePin.println("\nPatient "+patientID+" NOT FOUND ");
                    filePin.println("---------------------------------------------------------------------------------");
                }
                
                else
                {
                    //add the room object in the patient object
                    patient.setRoom(room);
                    
                    filePin.print("\nSuccessfully Processed by the System:");
                    filePin.println("\nFollowing are the details:");
                    filePin.println("\tPatient: "+patient.getName()+"\n\tAssigned to Room:"
                    +"\tRoom No: "+room.getRoomNo()+"\n\tLocated in floor: "+room.getFloor()
                    +"\n\tBlock :"+room.getBlock()+"\n\tCharges: "+room.getCharges()+"\n");
                    filePin.println("---------------------------------------------------------------------------------");
                }
                
            }
            
           
            else if(command.equalsIgnoreCase("Assign_Medicine_Patient"))
            { 
                filePin.print("Command " + command + ":");
                
                int patientID = Fileread.nextInt(); //read the patientID from the file
                
                int medNum = Fileread.nextInt(); //read the number of Medicine
                Patient patient = null;
                
                //create an array to read all the medicine codes
                int [] medicinecodes = new int[medNum]; 
                for(int i = 0; i < medicinecodes.length; i++)
                {
                    medicinecodes[i] = Fileread.nextInt();
                }
                
                //search for Patient object with the same ID
                for (int i =0; i < HPersons.length; i++)
                {
                    if(HPersons[i] instanceof Patient)
                    {    
                        if (patientID == HPersons[i].getId()) 
                        {
                            patient = ((Patient)HPersons[i]);
                            break;
                        }
                    }    
                }
                
                
                //print the result of Assigning Medicine to Patient
                if(patient == null)
                {
                    filePin.println("\nPatient "+patientID+" NOT FOUND ");
                    filePin.println("-----------------------------------------------------------------------------");
                }
                
                else if(!(medNum == patient.getTotalMedicine()))
                {
                    filePin.println("\nInformation mismatch: Patient "+patientID+"must have "
                    +patient.getTotalMedicine()+" medicine not "+medNum);
                    filePin.println("-----------------------------------------------------------------------------");
                }
                
                else
                {
                    int count = 0;
                    int medNotFound = 0;
                    for(int i = 0; i < medicinecodes.length; i++)
                    {
                        //search for Medicines object with the same code
                        for(int j = 0; j < HMedicines.length; j++)
                        {
                            if(medicinecodes[i] == HMedicines[j].getMedicineCode())
                            {
                                count++;
                                break;
                            }
                        }
                        
                        if(count != (i+1))
                        {
                            medNotFound = medicinecodes[i];
                            break;
                        }
                    }
                    
                    if(count != medicinecodes.length)
                    {
                            filePin.println("\nMedicines "+medNotFound+" NOT FOUND ");
                            filePin.println("-----------------------------------------------------------------------------");
                    }
                    
                    else
                    {
                        
                        Medicine medicine = null;
                        for(int i = 0; i < medicinecodes.length; i++)
                        {
                        
                            for(int j = 0; j < HMedicines.length; j++)
                            {
                                if(medicinecodes[i] == HMedicines[j].getMedicineCode())
                                {
                                    medicine = HMedicines[j];
                                    break;
                                }
                            }
                            
                            //add the Medicine object in the patient object
                            patient.setMedicine(medicine, i);
                        }
                        
                        filePin.print("\nSuccessfully Processed by the System:");
                        filePin.println("\nFollowing are the details:");
                        filePin.println("\tPatient: "+ patient.getName());
                        for(int i =0; i < patient.getTotalMedicine(); i++)
                        {
                            filePin.println("\tMedicine Prescribed: "+patient.getMedicine(i).getName());
                        }

                        filePin.println("-----------------------------------------------------------------------------");
                    }
                }
            }
            
            else if(command.equalsIgnoreCase("Print_Bill"))
            {
                
                //sort the HPersons array by the ID
                Arrays.sort(HPersons);
                
                //print the bill start here
                filePin.println("\nCommand: " + command + "\n\n\n");
                filePin.println("--------------- Welcome to KAU Hospital System ---------------\n");
                filePin.println("--------- Current Date :  "+new Date() +"--------\n");
                filePin.println("==================================================================");
                
                for (int i =0; i < HPersons.length; i++)
                {
                    if(HPersons[i] instanceof Patient)
                    {    
                        filePin.println("Patient Detail: ");
                        filePin.println(" ID: "+HPersons[i].getId()+" Name: "+HPersons[i].getName());
                        filePin.println("\tDoctor : "+((Patient)HPersons[i]).getDoctor().getName()
                        +"   Doctor Consultation Fees: "+((Patient)HPersons[i]).getDoctor().getConsultationfees()+" SR	");
                        filePin.println("\tMedicines  are:  ");
                        for(int j = 0; j < ((Patient)HPersons[i]).getTotalMedicine(); j++)
                        {
                            filePin.print("	Medicine name: ");
                            filePin.printf("%-13s\tPrice: %s SR "
                            ,((Patient)HPersons[i]).getMedicine(j).getName(),((Patient)HPersons[i]).getMedicine(j).getPrice());
                            filePin.println();
                            
                        }
                        filePin.println("\tRoom: "+((Patient)HPersons[i]).getRoom().getRoomNo()+" Room Charge: "
                        +((Patient)HPersons[i]).getRoom().getCharges()+" SR   ");
                        
                        filePin.println("		 ==== Total Charges :"+((Patient)HPersons[i]).calTotalBill()+" SR ====");
                        filePin.println("----------------------------------------------------------------");  
                    }    
                }
                
                //print the bill end here
            }
                
        }while(!command.equals("Quit"));
        
        filePin.println("Thank you for using KAU Hospital System, Good Bye!");
        
        //close the first file writer.
        filePin.close();
        
        //close the file reader.
        Fileread.close();
    }
}
