package hr_management;

public class Worker extends Human{

	private int weekSalary, workHoursPerDay;
	
	public Worker(){
		super();
	}
	
	public Worker(String name, String surname,int weekSalary, int workHoursPerDay){
		super(name, surname);
		this.weekSalary = weekSalary;
		this.workHoursPerDay = workHoursPerDay;
	}
	
	public Worker(Worker worker){
		super();
		this.weekSalary = worker.weekSalary;
		this.workHoursPerDay = worker.workHoursPerDay;
	}
	
	public void setWeekSalary(int weekSalary){
		this.weekSalary = weekSalary;
	}
	
	public void setWorkHoursPerDay(int workHoursPerDay){
		this.workHoursPerDay = workHoursPerDay;
	}
	
	public int getWeekSalary() {
		return weekSalary;
	}
	
	public int getWorkHoursPerDay() {
		return workHoursPerDay;
	}
	
	public long moneyPerHour() {
		return (weekSalary/7)/workHoursPerDay;
	}

	@Override
	public String toString() {
		return "Worker [weekSalary=" + weekSalary + ", workHoursPerDay=" + workHoursPerDay + super.toString() + "]";
	}

}
