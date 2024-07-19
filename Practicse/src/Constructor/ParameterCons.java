package Constructor;

public class ParameterCons {
String name;
int id;
ParameterCons(String name, int id)
{
	this.name=name;
	this.id=id;
}
}
class demo1{
	public static void main(String[] args) {
		ParameterCons p=new ParameterCons("oppo",324);
		System.out.println(p);
	}
}

