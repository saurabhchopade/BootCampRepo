import java.util.Random; 
public class EmployeeWage{   

		private static final int MAX_WORKING_DAYS=2,MAX_WORKING_HOURS=100;
		
		public static void main(String args[]){

			int totalWage=0;
			int totalWorkingHour=0,totalWorkingDays=0;
			EmployeeCheck empc=new EmployeeCheck();

			while(totalWorkingHour<MAX_WORKING_HOURS && totalWorkingDays<MAX_WORKING_DAYS){

				int empHour=0,empWage=0;
				totalWorkingDays++;
 				Random rand = new Random(); 
            int randomNum = rand.nextInt(1000)%3;

            empHour=empc.getHour(randomNum);
            empWage=empc.calcTotalWage(empHour);
				totalWage=totalWage+empWage;
				totalWorkingHour=totalWorkingHour+empHour;

				}

			System.out.println("TotalWage="+totalWage);
		}
	}
