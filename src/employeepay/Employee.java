package employeepay;

public class Employee {

	private String name;
	private double hourlyWage;
	private int numHours;

        //constructor
        public Employee(String givenName,double givenWage,int givenNumHours)
        {   
            name=givenName;
            hourlyWage=givenWage;
            numHours=givenNumHours;      
        }
        
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getHourlyWage() {
		return this.hourlyWage;
	}

	/**
	 * 
	 * @param hourlyWage
	 */
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getNumHours() {
		return this.numHours;
	}

	/**
	 * 
	 * @param numHours
	 */
	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

	public double CalculatePay() {
		double pay=hourlyWage*numHours;
                return pay;
	}

}