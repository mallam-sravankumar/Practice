package Polymorphism;

public class Addition {
public static void add(int i,int j)
{
	System.out.println(i+j);
}
public static void add(String s,String b)
{
	System.out.println(s+b);
}
public static void main(String[] args) {
	add(50,30);
	add("java","evergreen");
}
}
