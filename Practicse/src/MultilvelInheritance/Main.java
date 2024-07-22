package MultilvelInheritance;

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
class Three extends Two
{
	public void print_firstName()
	{
		System.out.println("printfirstname");
	}
}
public class Main {
public static void main(String[] args) {
	Three e=new Three();
	e.print_firstName();
	e.print_lastname();
	e.Print_name();

}
}
