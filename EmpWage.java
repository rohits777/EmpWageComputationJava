class EmpWage {
  public static void main(String[] args) {
     System.out.println("***Welcome to employee wage computation Program***"); 
       int fullTime = 1,partTime=2,wagePerHr=20;
        int workingHrs=0,dailyWage;
          int random=(int)Math.floor(Math.random()*10)%2;

     if(fullTime==random) 
      {
           System.out.println("Employee Is Present full time ");
           workingHrs=8;
       }
     else if(random==partTime)
       {
           System.out.println("Employee Is present  part time .");
                        workingHrs=4;
      }
      else
            System.out.println("Employee Is Absent ");

  dailyWage = wagePerHr*workingHrs; 
        System.out.println(" Daily wage of Employee is " +dailyWage);

    }
}
