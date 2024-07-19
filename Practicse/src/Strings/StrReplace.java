package Strings;

public class StrReplace {
public static void main(String[] args) {
	String s="java is case";
	StringBuilder sb=new StringBuilder(s);
	sb.replace(8, 12, "high");
	System.out.println(sb);
}
}
