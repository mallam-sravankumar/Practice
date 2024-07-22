package Oops;

public class Animal {
public void eat()
{
	System.out.println("Animal eats");
}
}
class Dog extends Animal
{
public void bark()
{
	System.out.println("Dog barks");
}
}
 class Forest
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		d1.bark();
		d1.eat();
	}
}