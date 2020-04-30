import java.util.Random; 
  
	public class EmployeeWage{   
		public static void main(String args[]){
					
			int empRateperHour=50,empHour=0,sallary=0;
			int fullTime=1,partTime=0;
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
		 	System.out.println("Sallry="+empHour*empRateperHour);
		}

	}

