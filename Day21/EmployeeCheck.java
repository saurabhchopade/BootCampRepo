 class EmployeeCheck{
		private static final int FULL_TIME=1,PART_TIME=0,EMP_RATE_PER_HOUR=50;

		public int getHour(int randomNum){

			int empHour=0;
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

			return empHour;
		}

		public int calcTotalWage(int empHour){

			int empWage=0,totalWage=0;
			empWage=empHour*EMP_RATE_PER_HOUR;
         totalWage=totalWage+empWage;
			return totalWage;
		}

}
