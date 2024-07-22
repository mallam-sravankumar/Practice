package SingleInheritance;
class Empolyee{
	private int salary;
	public Empolyee(int salary)
	{
		this.salary=salary;
	}
	public void work()
	{
		System.out.println("working on empolyee");
	}
	public int getsalary()
	{
		return salary;
	}
}
class Hr extends Empolyee
{
	public Hr(int salary) {
		super(salary);
	}
	public void work()
	{
		System.out.println("managing empolyee");
	}
	public void addemp() {
		System.out.println("adding new emp");
	}
}
public class Data {
	public static void main(String[] args) {
		Empolyee emp=new Empolyee(23000);
		Hr h=new Hr(40000);
		emp.work();
		System.out.println("Empolyee salary is :"+emp.getsalary());
		h.work();
		System.out.println("Hr salary is : "+h.getsalary());
		h.addemp();
	}
}