  public class EmployeeWage{

        public static final int fullTime = 1;
        public static final int partTime = 2;

        private  String company;
        private  int hrWages;
        private  int workingDays;
        private  int workingHours;
        static double EmpWages;

        public EmployeeWage(String company, int hrWages, int workingDays, int workingHours) {
            this.company=company;
            this.hrWages=hrWages;
            this.workingDays=workingDays;
            this.workingHours=workingHours;
        }


        private double CompanyEmpWage(){
            int TotalWorkingHours=0;
            int TotalWorkingDays=0;

            double TotalWages = 0;
            while(TotalWorkingHours<=workingHours && TotalWorkingDays <=workingDays ) {
                TotalWorkingDays++;
                int empID= (int) Math.floor(Math.random()*10)%3;
                switch (empID) {
                    case fullTime :{
                        TotalWorkingHours=+8;
                        break;
                    }
                    case partTime :{
                        TotalWorkingHours=+4;
                        break;
                    }
                    default : {
                        TotalWorkingHours=+0;

                    }
                }
                EmpWages = TotalWorkingHours*hrWages*workingDays;
                TotalWages += EmpWages;
            }
            return TotalWages;

        }


        public static void main(String[] args) {

            System.out.println("Welcome to Employee Wage Computation\r\n" +
                    "Program on Master Branch\n\n");

            EmployeeWage DMart = new EmployeeWage("DMart",20,20,100);
            EmployeeWage SMall = new EmployeeWage("SMall",10,20,100);
            EmployeeWage MantriMall = new EmployeeWage("MantriMall",15,20,100);

            System.out.println("Total Monthly wages of "+DMart.company+" is : Rs "+DMart.CompanyEmpWage());
            System.out.println("Total Monthly wages of "+SMall.company+" is : Rs "+SMall.CompanyEmpWage());
            System.out.println("Total Monthly wages of "+MantriMall.company+" is : Rs "+MantriMall.CompanyEmpWage());



        }
    }
