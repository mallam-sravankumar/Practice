package Strings;

public class StringBuilderDelete {
public static void main(String[] args) {
	String s="Programming";
	StringBuilder sb=new StringBuilder(s);
	sb.delete(0, 5);
	System.out.println(sb);
}
}
