package sele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListEx {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList();
		
		list.add("AA");
		list.add("CC");
		list.add("BB");
		//list.add(10);
		//list.add(20);
		
		System.out.println(list);
		int i2=list.size();
		System.out.println(i2);
		
		String[] str = new String[10];
		
	
		/*
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		} 
		
		for(String li:list) {
			System.out.println(li);
		}
		
		
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		

	}

}
