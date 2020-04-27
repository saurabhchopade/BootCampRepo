import java.util.Random; 
  
	public class EmployeeWage{   
		public static void main(String args[]){
		
			int empRateperHour=50,empHour=0,sallary=0;
      	Random rand = new Random(); 
        	int randomNum = rand.nextInt(1000); 

			if(randomNum%2==1) {

				System.out.println("Employee Present");
				empHour=8;
				sallary=empHour*empRateperHour;
				System.out.println("Sallary="+sallary);
				
			}
			else{

				System.out.println("Employee Absent");
				sallary=0;
				System.out.println("Sallary=0");

			}
		}
	}

