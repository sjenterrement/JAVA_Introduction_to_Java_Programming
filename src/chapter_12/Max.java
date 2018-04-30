package chapter_12;

public class Max {
	//return the maximum of two objects
	public static Comparable max(Comparable o1,Comparable o2) {
		if(o1.compareTo(o2)>0)
			return o1;
		else
			return o2;
	}

}
