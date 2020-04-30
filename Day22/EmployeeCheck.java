import java.util.Random;
class EmployeeCheck{

	//Constants
	private static final int FULL_TIME=1,PART_TIME=0;
	private final int ratePerHour,maxWorkingDays,maxWorkingHours;

	//Public bacause We Are Accessing It in the EmployeeWage Class
	public String company;

	//Constructor  
	public EmployeeCheck(String company,int ratePerHour,int maxWorkingDays,int maxWorkingHours) {

		this.company= company;
		this.ratePerHour=ratePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
	}

	public int calcTotalWage() {

		int totalWage=0;
		int totalWorkingHour=0,totalWorkingDays=0;
		
		//Loop For Number Of Hour Or Day reached and Iterrate  Days
		while(totalWorkingHour<maxWorkingHours && totalWorkingDays<maxWorkingDays){

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

		 	empWage=empHour*ratePerHour;
			totalWage=totalWage+empWage;
			totalWorkingHour=totalWorkingHour+empHour;
		}

		//Total Wage Calculated
		   return totalWage;
	}
}
