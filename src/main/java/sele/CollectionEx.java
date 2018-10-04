package sele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList();
		li.add("AB");
		//li.add(12);
		//li.add(90.89);
		li.add("AG");
		li.add("AG");
		li.add("Thomma");
		li.add("AB");
		
		//System.out.println("By List:"+li);
		
		Set <String> set = new HashSet();
		set.add("AB");
		set.add("AB");
		set.add("AD");
		set.add("Thomma");
		
		System.out.println("By Set:"+set);
		
		Iterator itr= set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
		for(int i=0;i<set.size();i++) {
			
		}
		
		
	}

}
