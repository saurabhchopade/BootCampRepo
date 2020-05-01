public class CompanyEmpWage {
	//Variable Declaration
	public final String company;
 	public final int ratePerHour;
 	public final int maxWorkingDays;
 	public final int maxWorkingHours;
 	public int totalWage;

	//Constructor
	public CompanyEmpWage(String company,int ratePerHour,int maxWorkingDays,int maxWorkingHours){
		this.company=company;
		this.ratePerHour=ratePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
	}
	//Capture Value of total Wage Through computeEMPWage
	public void setTotalEmpWage(int totalWage){
 		this.totalWage = totalWage;
		System.out.println(" Company Name="+company+" Wage="+totalWage);

	}
}
