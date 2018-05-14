package casual;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ytb_2018_5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] thing= {"egg","lasers","hats","pie"};
		ArrayList<String> List1=new ArrayList<String>();
		
		//add array items to list
		for (String x:thing) 
			List1.add(x);
		
		String[] morethings= {"lasers","hats"};
		ArrayList<String> List2=new ArrayList<String>();
		
		//add array items to list
		for(String y:morethings)
			List2.add(y);
		
		//print list1 list2
		for (int i = 0; i < List1.size(); i++)
			System.out.printf("%s ", List1.get(i));
		System.out.println();
		
		editlist(List1,List2);
		System.out.println();
		for (int i = 0; i < List1.size(); i++)
			System.out.printf("%s ", List1.get(i));
		
	}
	
	public static void editlist(Collection<String> a,Collection<String> b) {
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			if(b.contains(it.next()))
				it.remove();
		}
	}
}
