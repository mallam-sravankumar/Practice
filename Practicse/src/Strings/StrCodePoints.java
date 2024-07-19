package Strings;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrCodePoints {
public static void main(String[] args) {
	String s="welcome java";
	
	IntStream sa=s.codePoints();
	System.out.println("VALUED ARE");
	Stream.forEach(System.out.print );
}
}