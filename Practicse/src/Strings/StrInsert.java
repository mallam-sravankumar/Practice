package Strings;

public class StrInsert {

	public static void main(String[] args) {
		String s="java";
		StringBuilder sb=new StringBuilder(s);
		sb.insert(4,"development");
		System.out.println(sb);

	}

}
