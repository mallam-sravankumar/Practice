package Strings;

public class StrCodePointCount {
public static void main(String[] args) {
	String s="java is a high level language";
	StringBuffer str=new StringBuffer(s);
	int a=str.codePointCount(1, 15);
	System.out.println(a);
	
}
}
