package employeepay;

public class Program {

	/**
	 * 
	 * @param String
	 */
	public static void main(String[] args) {
		
            Employee e1=new Employee("Evan",120,10);
            System.out.println("Employee earned "+ e1.CalculatePay());
            //System.out.println("Employee earned "+ e2.CalculatePay());
            Manager m1=new Manager("Stewart",100,20,1000);
            
            System.out.println("Manager earned "+m1.CalculatePay());
        }

}