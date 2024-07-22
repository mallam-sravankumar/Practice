package MultipleInheritance;
interface One{
 void print_name();
}
interface Two{
	 void print_lname();
}
interface Three extends One,Two{
	
}

 class four implements Three{
	 public void print_name() {
		System.out.println("sravan kumar");
	}
	 public void print_lname()
	{
		System.out.println("m");
	}
}
public class Basic {
public static void main(String[] args) {
	four c=new four();
	c.print_name();
	c.print_lname();
}
}

