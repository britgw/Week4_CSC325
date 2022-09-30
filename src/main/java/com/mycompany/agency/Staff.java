package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
     public Staff ()
  {
    staffList = new StaffMember[8];
    staffList[0] = new Executive ("Moaath Alrajab", "25 New Tree Line", "516-101-3131", "000-000-1234", 21900.5);
    staffList[1] = new Executive ("John", "456 Off Line", ": 516-555-0101", " 516-65-4321", 1546.15);
    staffList[2] = new Executive ("William", "789 Off Rocker", "516-555-0000", "631-20-3040", 1669.23);
    staffList[3] = new Executive ("Sam", " 678 Fifth Ave", " 516-555-0690", "40", 622.0);
    staffList[4] = new TempEmploee ("ALex", "987 Wood Blvd", "516-555-8374","DONE",0.0);
    staffList[5] = new TempEmploee ("Ahmad", "321 Elm Lane", "516-555-7282", "DONE",0.0);
    staffList[6] = new TempEmploee ("Maya", "1 Wood Blvd", "516-555-4312", "DONE",0.0);
    staffList[7] = new TempEmploee ("Shahen", " 4 Elm Lane", "516-555-7222", "DONE",0.0);
    
    

    
    //((Executive)staffList[0]).awardBonus (500.00);

    //((Hourly)staffList[3]).addHours (40);
  }
    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
