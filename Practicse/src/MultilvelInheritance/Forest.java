package MultilvelInheritance;
  class Aniaml
{
	 
	public void eat()
	{
		System.out.println("Animal eats");
	}
	}
	class dog extends Aniaml
	{
		public void bark()
		{
			System.out.println("Dogs bark");
		}
	}
	class cat extends dog
	{
		public void meow()
		{
			System.out.println("Cat meows");
		}
	}
	class Forest{
	public static void main(String[] args) {
		cat d1=new cat();
		d1.eat();
		d1.bark();
		d1.meow();
	}
}