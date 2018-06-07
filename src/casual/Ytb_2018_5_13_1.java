package casual;

public class Ytb_2018_5_13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"funk","furry","chunk","banana"};
		
		//startWith
		System.out.print(words.length);
		for(String w:words) {
			if(w.startsWith("fu"))
				System.out.println(w+" start with fu.");
		}

		//endsWith
				for(String w:words) {
					if(w.endsWith("unk"))
						System.out.println(w+" ends with unk.");
				}
	}

}
