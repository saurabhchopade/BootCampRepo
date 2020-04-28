import java.util.Random; 

	public class EmployeeWage{   
		public static void main(String args[]){

			int empHour=0,sallary=0,totalWage=0,totalWorkingHour=0;
			int fullTime=1,partTime=0;
         EmployeeCheck empc=new EmployeeCheck();

			for(int month=1;month<=50;month++) {

      		Random rand = new Random(); 
        		int randomNum = rand.nextInt(1000)%3;
				empHour=empc.getHour(randomNum);

				totalWage=empc.calcTotalWage(empHour);
				totalWorkingHour=totalWorkingHour+empHour;

				if(empc.checkReached(totalWorkingHour)){
					System.out.println("Totat Hour reached"+totalWorkingHour);
					System.out.println("TotalWage="+totalWage);  
					System.exit(0);
				}

			}
		}
	}

 class EmployeeCheck{

		int empHour=0,empRateperHour=50,sallary=0,totalWage=0;

		public int getHour(int randomNum){
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

		return empHour;
		}

		public int calcTotalWage(int empHour){

			sallary=empHour*empRateperHour;
         totalWage=totalWage+sallary;
			return totalWage;
		}

		public boolean checkReached(int totalWorkingHour){

			return totalWorkingHour==100;
		}
} 

