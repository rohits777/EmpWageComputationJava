class EmpWage {
public static final int IS_Full_Time=1,IS_Part_Time=2,wagePerHr=20;
public static void main(String[] args) {
     System.out.println("***Welcome to employee wage computation Program***"); 
        int workingHrs=0,dailyWage;
        int random=(int)Math.floor(Math.random()*10)%3;

      switch(random) 
      {
        case IS_Full_Time:
                 System.out.println("Employee Is Present full time ");
                 workingHrs=8;
                 break;
        
         case IS_Part_Time:
                 System.out.println("Employee Is present  part time .");
                 workingHrs=4;
                 break; 

         default:
                System.out.println("Employee Is Absent ");
      }

  dailyWage = wagePerHr*workingHrs; 
        System.out.println(" Daily wage of Employee is " +dailyWage);

    }
}
