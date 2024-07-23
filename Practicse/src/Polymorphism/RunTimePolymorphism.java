package Polymorphism;
class A1{
	void m1()
	{
		System.out.println("m1 method of A");
	}
}
class B1 extends A1
{
	void m1()
	{
		System.out.println("m1 method of B");
	}
}
public class RunTimePolymorphism {
public static void main(String[] args) {
	A1 a=new A1();
	a.m1();
	B1 b=new B1();
	b.m1();
	A1 v=new B1();
	v.m1();
}
}
