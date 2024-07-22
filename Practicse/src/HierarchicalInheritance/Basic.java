package HierarchicalInheritance;
class A{
	public void A()
	{
		System.out.println("A-BASE CLASS");
	}
}
class B extends A
{
	public void B()
	{
		System.out.println("B-Derived class");
	}
}
class C extends A
{
	public void C()
	{
		System.out.println("C-Derived class");
	}
}
public class Basic {
public static void main(String[] args) {
	B t=new B();
	t.A();
	t.B();
	C u=new C();
	u.C();
	u.A();
	
}
}
