import java.util.Random; 
  
	public class EmployeeWage{ 
  
		public static void main(String args[]){

      	Random rand = new Random(); 
        	int randomNum = rand.nextInt(1000); 

			if(randomNum%2==1) {
				System.out.println("Employee Present");
		
			}
			else{

				System.out.println("Employee Absent");
			}
		}
	}

