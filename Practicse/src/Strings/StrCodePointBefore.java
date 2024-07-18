package Strings;

public class StrCodePointBefore {
public static void main(String[] args) {
	String str="java";
	StringBuffer sb=new StringBuffer(str);
int a=		sb.codePointBefore(1);
System.out.println(a);
}
}
