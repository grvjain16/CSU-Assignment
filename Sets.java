package com.csu.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import com.google.common.base.Stopwatch;

public class Sets {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		
		Set<Integer> num = new HashSet<>();
		for(int i=0;i<100;i++) {
			num.add(i* rand.nextInt(200));
		}
		
		Set<Integer> num1 = new LinkedHashSet<>();
		for(int i=0;i<100;i++) {
			num.add(i* rand.nextInt(200));
		}
		Set<Integer> num2 = new TreeSet<>();
		for(int i=0;i<100;i++) {
			num.add(i* rand.nextInt(200));
		}
		
		
		traverseSet(num,"HashSet");
		traverseSet(num1,"LinkedHashSet");
		traverseSet(num2,"TreeSet");		
	}
	
	public static void  traverseSet(Set<Integer> st,String setName) {
		
		Stopwatch timer = Stopwatch.createUnstarted();
		
		timer.start();
	
		for(int i=1;i<=5;i++) {
			Iterator<Integer> itr = st.iterator();

			while(itr.hasNext()) {
				itr.next();
			}
		}

		timer.stop();
		
		System.err.println("\nTraverse time for  "+ setName+" : " + timer);
	}

}
