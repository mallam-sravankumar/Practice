package ClassObject;

public class Animal{
String DogName;
String Breed;
String color;

Animal(String name,String Breed,String color)
{
	this.DogName=DogName;
	this.Breed=Breed;
	this.color=color;	
}
public String toString()
{
	return DogName+" "+Breed+" "+color;
}
public static void main(String[] args) {
	Animal a=new Animal("Chintu","labrator","White");
	String s=a.toString();
	System.out.println(s);
}
}