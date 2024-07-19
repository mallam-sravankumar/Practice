package Constructor;

public class Animal {
	String name;
	int id;
	Animal(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Animal(Animal obj2){
		this.name=obj2.name;
		this.id=obj2.id;
	}
	class demo1{
		public static void main(String[] args) {
			System.out.println("First object");
			Animal a=new Animal("Dog",500);
		}
	}


}
