import java.util.Random;
public class EmployeeCheck{

	//Constants
	private static final int FULL_TIME=1,PART_TIME=0;
	private int noOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	//Constructor 
	public EmployeeCheck(){
	//created Array Of Five 
	companyEmpWageArray =new CompanyEmpWage[5];

	}

	private void addCompanyEmpWage(String company, int ratePerHour, int maxWorkingDays, int maxWorkingHours ){
		//calling Constructor of CompanyEmpWage
		companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, ratePerHour,maxWorkingDays, maxWorkingHours);
		//Counter Incresing Each Function call
		noOfCompany++;
	}
	
	private void  computeEmpWage(){
		for(int i=0;i<noOfCompany;i++){

			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));

		}
	}

	//To compute Total Wage
	private int computeEmpWage( CompanyEmpWage CompanyEmpWage) {
		//methods Variables
		int totalWage=0;
		int totalWorkingHour=0,totalWorkingDays=0;
		
		//Loop For Number Of Hour Or Day reached and Iterrate  Days
		while(totalWorkingHour<CompanyEmpWage.maxWorkingHours && totalWorkingDays<CompanyEmpWage.maxWorkingDays){

			int empHour=0,empWage=0;
			totalWorkingDays++;
      	Random rand = new Random(); 
        	int randomNum = rand.nextInt(1000)%3; 	
			switch(randomNum){
				case PART_TIME:
					empHour=8;
					break;
				case FULL_TIME:
					empHour=4;
					break;
				default:
					empHour=0;
				}

		 	empWage=empHour*CompanyEmpWage.ratePerHour;
			totalWage=totalWage+empWage;
			totalWorkingHour=totalWorkingHour+empHour;
		}

		//Total Wage Calculated
		   return totalWage;
	}

      public static void main(String args[]){
      //Here 50 is ratePerHour 2 is working days /10 total Working Hours
      final EmployeeCheck obj=new EmployeeCheck();
      obj.addCompanyEmpWage("Dmart",50,2,10);
		obj.addCompanyEmpWage("BigBazar",70,3,10);
      obj.computeEmpWage();
      }
}
