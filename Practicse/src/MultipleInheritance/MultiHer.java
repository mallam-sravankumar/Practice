package MultipleInheritance;

interface A{
	void m1();
}
interface B{
	void m1();
}
interface C extends A,B
{
	
}
class D implements C
{
	public void m1()
	{
		System.out.println("A-CLASS");
	}

public void m2() {
	System.out.println("B-CLASS");
}
}
public class MultiHer {
public static void main(String[] args) {
	D d1=new D();
	d1.m1();
	d1.m2();
}
}
