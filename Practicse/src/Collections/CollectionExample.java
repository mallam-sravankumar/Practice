package Collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionExample {
public static void main(String[] args) {
	int a[]=new int[] {1,3,4,5,6,7};
	Vector<Integer>v=new Vector<Integer>();
	Hashtable<Integer,String>h=new Hashtable();
	v.addElement(1);
	v.addElement(2);
	h.put(1,"sravan");
	h.put(2,"kumar");
	System.out.println(a[0]);
	System.out.println(v.elementAt(0));
	System.out.println(h.get(1));
}
}
