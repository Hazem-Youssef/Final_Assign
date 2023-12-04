package employeepay;

public class Manager extends Employee {

	private double bonus;

        public Manager(String givenName,double givenWage,int givenNumHours,double givenBonus)
        {
            super(givenName,givenWage,givenNumHours);
            bonus=givenBonus;
        }
	public double getBonus() {
		return this.bonus;
	}

	/**
	 * 
	 * @param bonus
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

        @Override
	public double CalculatePay() {
		//double pay=getHourlyWage() * getNumHours()+bonus;
                double pay=super.CalculatePay()+bonus;
                return pay;
        }

}