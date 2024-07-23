package Encapsulation;
class Person{
	private String name;
	private int age;
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public String getname() {
		return "name";
	}public int getage()
	{
		return age;
	}
}
public class Main {
	public static void main(String[] args) {
Person p=new Person();
p.setname("sravan");
p.setage(23);
System.out.println(p.getname());
System.out.println(p.getage());

}
}