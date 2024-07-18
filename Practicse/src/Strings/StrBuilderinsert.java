package Strings;

public class StrBuilderinsert {
public static void main(String[] args) {
	String s="java is case senstivity";
	StringBuilder sb=new StringBuilder(s);
	sb.insert(8, "an ");
	System.out.println(sb);
}
}
