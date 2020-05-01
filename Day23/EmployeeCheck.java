import java.util.*;
import java.util.Random;
public class EmployeeCheck implements IComputeEmpWage{
	//Constants
	private static final int FULL_TIME=1,PART_TIME=0;
	private int noOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	//declaring Collection 
	private LinkedList<CompanyEmpWage> wageList;
	private Map<String,CompanyEmpWage> wageMap;

	
	//Constructor  
	public EmployeeCheck(){
		wageList=new LinkedList<>();
		wageMap=new HashMap<>();
	}

	private void addCompanyEmpWage(String company, int ratePerHour, int maxWorkingDays, int maxWorkingHours ){
		//calling Constructor of CompanyEmpWage
		CompanyEmpWage companyEmpWage= new CompanyEmpWage(company, ratePerHour,maxWorkingDays, maxWorkingHours);
		wageList.add(companyEmpWage);
		wageMap.put(company,companyEmpWage);
	}
	
	private void  computeEmpWage(){
		for(int i=0;i<wageList.size();i++){
			CompanyEmpWage companyEmpWage=wageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);			

		}
	}

	private int getTotalempWage(String company){
		return wageMap.get(company).totalWage;
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
      EmployeeCheck  obj=new EmployeeCheck();
      obj.addCompanyEmpWage("Dmart",50,2,10);
		obj.addCompanyEmpWage("BigBazar",70,3,10);
      obj.computeEmpWage();

      }
}
