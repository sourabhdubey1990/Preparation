package IntPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			names.add("Sourabh " + i);
		}
		String[] newnames = new String[names.size()];
		int i = 0;

		for (String string : names) {

			newnames[i] = string;
			i++;
		}
		for (String string : newnames) {
			System.out.println(string);
		}
		
		//Another Method
		String[] newnames1=names.toArray(new String[names.size()]);
		for (String string : newnames1) {
			System.out.println("Names Here: "+string);
		}
		
	}

}
