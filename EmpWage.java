class EmpWage {
  public static void main(String[] args) {
     System.out.println("***Welcome to employee wage computation Program***"); 
       int present = 1, wagePerHr=20;
        int workingHrs=0,dailyWage;
          int random=(int)Math.floor(Math.random()*10)%2;

     if(present==random) 
      {
           System.out.println("Employee Is Present ");
           workingHrs=8;
 }
      else
            System.out.println("Employee Is Absent ");

  dailyWage = wagePerHr*workingHrs; 
        System.out.println(" Daily wage of Employee is " +dailyWage);

    }
}
