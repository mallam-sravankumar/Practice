package SingleInheritance;
class One{
	public void Print_name()
	{
		System.out.println("printSurname");
	}
}
class Two extends One{
	public void print_lastname()
	{
		System.out.println("printlastname");
	}
}
public class Main {
public static void main(String[] args) {
	Two e=new Two();
	e.print_lastname();
	e.Print_name();
}
}
