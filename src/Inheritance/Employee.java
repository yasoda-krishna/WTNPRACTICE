package Inheritance;


class Person
{
	String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Employe extends Person
{
	//annual salary (double), the year the employee started to work, and the national insurance number which is a String
	double salary;
	int yearOfJoin;
	String insuranceNumber;
	public Employe(String name, double salary, int yearOfJoin, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.yearOfJoin = yearOfJoin;
		this.insuranceNumber = insuranceNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getYearOfJoin() {
		return yearOfJoin;
	}
	
	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
}





public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person("Yasoda");
		Employe e = new Employe("Krishna",500000.0,2021,"CT2028654789");
		p.setName("YasodaKrishna");
		e.setName("YasodaKrishna");
		e.setSalary(657869.689);
		e.setYearOfJoin(2020);
		e.setInsuranceNumber("APX8903576t");
		
		System.out.println("    name of person: " + e.getName());
		System.out.println("salary of employee: " + e.getSalary());
		System.out.println("      Year of join: " + e.getYearOfJoin());
		System.out.println("  Insurance number: " + e.getInsuranceNumber());
	}

}
