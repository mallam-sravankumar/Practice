package Strings;

public class StrCodePointAt {
public static void main(String[] args) {
	String str="java";
	StringBuffer sb=new StringBuffer(str);
	int a=sb.codePointAt(2);
	System.out.println(a);
}
}
