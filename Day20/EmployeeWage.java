import java.util.Random; 
public class EmployeeWage{   

		private static final int FULL_TIME=1,PART_TIME=0,EMP_RATE_PER_HOUR=50,MAX_WORKING_DAYS=2,MAX_WORKING_HOURS=100;
		
		public static void main(String args[]){

			int totalWage=0;
			int totalWorkingHour=0,totalWorkingDays=0;

			while(totalWorkingHour<MAX_WORKING_HOURS && totalWorkingDays<MAX_WORKING_DAYS){

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
				
		 		empWage=empHour*EMP_RATE_PER_HOUR;
				totalWage=totalWage+empWage;
				totalWorkingHour=totalWorkingHour+empHour;
				System.out.println("empWage="+empWage); 
				}

			
			System.out.println("TotalWage="+totalWage);
		}
	}
  

