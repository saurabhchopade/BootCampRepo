public class EmployeeWage{   
		public static void main(String args[]){

			int empRateperHour=50,empHour=0,sallary=0,totalWage=0;
			int empRateperHour=50,empHour=0,sallary=0,totalWage=0,totalWorkingHour=0;
			int fullTime=1,partTime=0;
			
			for(int month=1;month<=50;month++) {

      				Random rand = new Random(); 
        			int randomNum = rand.nextInt(1000)%3; 	
				switch(randomNum){
				case 0:
					empHour=8;
					break;
				case 1:
					empHour=4;
					break;
				default:
					empHour=0;
				}
				
		 		sallary=empHour*empRateperHour;
				totalWage=totalWage+sallary;
				totalWorkingHour=totalWorkingHour+empHour;
				if(totalWorkingHour==100){
					System.out.println("Totatreached"+totalWorkingHour);
					System.out.println("TotalWage="+totalWage);  
					System.exit(0);
				}

			}
			System.out.println("TotalWage="+totalWage);
		}
	}
  

