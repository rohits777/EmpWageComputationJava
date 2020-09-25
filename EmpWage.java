class EmpWage {
public static final int IS_FULL_TIME=1,IS_PART_TIME=2;
static final int MAX_WORKING_HRS=100;
  public void computeWage ( String company,int wagePerHr,int maxHrsPerMonth,int workingDays )
  {


     int workingHrs=0,dailyWage,monthlyWage=0,totalWorkingHrs=0,totalWorkingDays=0;
      while (totalWorkingDays <= workingDays && totalWorkingHrs <= MAX_WORKING_HRS)
      {
              int random=(int)Math.floor(Math.random()*10)%3;
              totalWorkingDays++;
         switch(random) 
         {
           case IS_FULL_TIME:

                 workingHrs=8;
                 break;

           case IS_PART_TIME:

                 workingHrs=4;
                 break; 

            default:

                    workingHrs=0;
         }

             totalWorkingHrs += workingHrs; 
        System.out.println("Total Working Hours:" +totalWorkingHrs +    "Total Working Days:" +totalWorkingDays);

      }
                monthlyWage = totalWorkingHrs*wagePerHr;
                System.out.println(" Monthly wage of Employee of "+company+" is: " +monthlyWage);

    }

   public static void main(String args[]) 
    {
    System.out.println("***Welcome to employee wage computation Program***");
     EmpWage emp=new EmpWage();
      emp.computeWage("Nauttica",20,90,20);
      emp.computeWage("NothenKing",20,57,12);
      emp.computeWage("AllStar007",20,67,19);
  }
}
