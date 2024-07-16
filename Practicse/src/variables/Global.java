package variables;

public class Global {


	String AnimalName="Dog";
	String Breed="lab";
	int Price=7000;
public static void main(String[] args) {
	Global v=new Global();
	System.out.println(v.AnimalName);
	System.out.println(v.Breed);
	System.out.println(v.Price);
}
}


