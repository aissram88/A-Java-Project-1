

public class PayrollCalculation {
    //Payroll Calculation

        private int basicsaraly; //€
        private int overtimeHour;

        private int overtimehourlyRate =15; //€ per hour
        int overTimePay; //overtimehourlyRate * overtimeHour

        final int travelAllowance =150;

        int grossPay; // basicsaraly + overtimepay+travelAllowance

        float healthInsuranceRate = 0.05f; 
        int healthInsuranceFee;//grosspay*5%

        float welfarePensionRate = 0.09f; 
        int welfarePension;//grosspay*9%

        float incomeTaxRate=0.05f; 
        int incomeTaxFee;//(grosspay - healthInsuranceFee - welfarePension)*5%

        int netIncome; // grosspay-healthInsuranceFee - welfarePension-IncomeTaxfee

        public PayrollCalculation(int basicsaraly,int overtimeHour){
            this.basicsaraly= basicsaraly;
            this.overtimeHour=overtimeHour;
            setOverTimePay();
            setGrossPay();
            setHealthInsurancefee();
            setWelfarePension();
            setIncomeTaxfee();
            setNetIncome();
        }
        public PayrollCalculation(){
            
        }
        

        public void setOverTimePay(){
           this.overTimePay=overtimeHour*overtimehourlyRate;
        }
        public int getOverTimePay(){
            return this.overTimePay;
        }
        public void setGrossPay(){
            this.grossPay=basicsaraly+overTimePay+travelAllowance;
        }
        public int getGrossPay(){
            return this.grossPay;
        }

        public void setHealthInsurancefee(){
           this.healthInsuranceFee=(int)(grossPay*healthInsuranceRate);
        }
        public int getHealthInsurancefee(){
           return this.healthInsuranceFee;
        }
        public void setWelfarePension(){
            this.welfarePension=(int)(grossPay*welfarePensionRate);
        }
        public int getWelfarePension(){
            return this.welfarePension;
        }
        public void setIncomeTaxfee(){
            incomeTaxFee=(int)((grossPay-healthInsuranceFee-welfarePension)*incomeTaxRate);
        }
        public int getIncomeTaxfee(){
            return this.incomeTaxFee;
        }
        public void setNetIncome(){
            this.netIncome = grossPay-healthInsuranceFee-welfarePension-incomeTaxFee;
        }
        public int getNetIncome(){
            return this.netIncome;
        }

        public String payroll(){
            return "===Payroll===\nBasic Saraly:€"+ basicsaraly+"\nOvertime Payment:€"+overTimePay+"\nTravel Allowance:€"+travelAllowance+"\n------"
            +"\nGross Pay:€"+grossPay+"\n------"+"\n"+"Health Insurance:€"+healthInsuranceFee+"\nWelfare Pension:€"+welfarePension+"\nIncome Tax:€"+incomeTaxFee+
            "\n------"+"\nNet Income:€"+netIncome;
        }
   
    
}
