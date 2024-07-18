package Strings;

public class StrDeleteCharAt {
public static void main(String[] args) {
	String s="High";
	StringBuilder sb=new StringBuilder(s);
	sb.deleteCharAt(2);
	System.out.println(sb);
}
}
