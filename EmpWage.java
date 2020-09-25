class EmpWage {
public static final int IS_FULL_TIME=1,IS_PART_TIME=2,WAGE_PER_HR=20,WORKING_DAYS=20;
static final int MAX_WORKING_HRS=100;
  public void computeWage()
  {
     System.out.println("***Welcome to employee wage computation Program***");

     int workingHrs=0,dailyWage,monthlyWage=0,totalWorkingHrs=0,totalWorkingDays=0;
      while (totalWorkingDays <= WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS)
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
                monthlyWage = totalWorkingHrs*WAGE_PER_HR;
                System.out.println(" Monthly wage of Employee is " +monthlyWage);

    }

   public static void main(String args[]) 
    {
     EmpWage emp=new EmpWage();
      emp.computeWage();
     }
}
