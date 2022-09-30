package com.mycompany.agency;



// TODO 1: Make this class work and public
 public abstract class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this staff member using the specified
    //  information.
    //-----------------------------------------------------------------
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //-----------------------------------------------------------------
    // TODO 2: Returns a string including the basic employee information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result= " ";
        //for loop
        for(int i = 1; i<8; i++){
        result = "Employee: "+i+
                "\nName: "+name+
                 "\nAddress: "+address+
                 "\nPhone: "+phone+"\n";
        }
        return result; 
    }

    //-----------------------------------------------------------------
    //  Derived classes must define the pay method for each type of
    //  employee.
    //-----------------------------------------------------------------
    public abstract double pay();
}
