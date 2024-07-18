package Strings;

public class Strindexof {
public static void main(String[] args) {
	String s="high level language";
	StringBuilder sb=new StringBuilder(s);
	int a=sb.indexOf("level", 2);
	System.out.println(a);
}
}
