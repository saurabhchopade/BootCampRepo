import java.util.Random;
//Only one Class in a Final Procedural Way
public class EmpWageProcedure{
	//Global Constants
	private static final int FULL_TIME=1,PART_TIME=0;

	public final static  void  calcTotalWage(String company,int ratePerHour,int maxWorkingDays,int maxWorkingHours) {
		int totalWage=0;
		int totalWorkingHour=0;
		int totalWorkingDays=0;
		//Loop For Number Of Hour Or Day reached and Iterrate  Days
		while(totalWorkingHour<maxWorkingHours && totalWorkingDays<maxWorkingDays){
			
			//Local Variables To function clacTotalWage
			int empHour=0;
			int empWage=0;
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
			//empWage Is Daily Wage 
		 	empWage=empHour*ratePerHour;
			totalWage=totalWage+empWage;

			//Total Employee Wage Calculated
			totalWorkingHour=totalWorkingHour+empHour;
		}
			//Diplaying Total Wage Of Company
		   System.out.println("Company Name="+company+"  Total Wage="+totalWage);
	}

	public static void main(String args[]){
		//Calling  Function To get Total Wage For each Company
		calcTotalWage("Dmart",50,2,10);
		calcTotalWage("BigBazar",70,4,15);
		}
}
