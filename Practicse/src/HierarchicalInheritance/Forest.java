package HierarchicalInheritance;


class Aniaml
{
	 
		public void eat()
		{
			System.out.println("Animal eats");
		}
		}
		class Dog extends Aniaml
		{
			public void bark()
			{
				System.out.println("Dogs bark");
			}
		}
		class cat extends Dog
		{
			public void meow()
			{
				System.out.println("Cat meows");
			}
		}

public class Forest {
public static void main(String[] args) {
	Dog  d=new Dog();
	d.eat();
	d.bark();
	cat d1=new cat();
	d1.meow();
}
}
