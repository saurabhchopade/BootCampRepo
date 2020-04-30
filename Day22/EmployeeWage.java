public class EmployeeWage{   
		
		public static void main(String args[]){
		//Here 50 is ratePerHour 2 is working days /10 total Working Hours

		EmployeeCheck dMart=new EmployeeCheck("Dmart",50,2,10);
		System.out.println(" CompanyName= "+dMart.company+" TotalWage= "+dMart.calcTotalWage());

		EmployeeCheck bigB=new EmployeeCheck("BigBazar",70,4,15);
      System.out.println(" CompanyName= "+bigB.company+" TotalWage= "+bigB.calcTotalWage());

		}
	}
