package com.csu.assignments;

import java.util.*;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {

		List<String> arrLst = new ArrayList<String>();
		arrLst.add("Faiz");
		arrLst.add("Imad");
		arrLst.add("Azam");

		List<String> linkLst = new LinkedList<String>();
		linkLst.add("Faiz");
		linkLst.add("Imad");
		linkLst.add("Azam");

		System.out.println("ArrayList add time:  " + addElementToList(arrLst));
		System.out.println("LinkedList add time:  " + addElementToList(linkLst));

		System.out.println("\nArrayList get Item  time:  " + getObjectItem(arrLst));
		System.out.println("LinkedList get Item time:  " + getObjectItem(linkLst));

	}

	private static long addElementToList(List<String> lstObj) {
		long startTime = System.nanoTime();

		lstObj.add(1, "Qamar");

		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		return duration;
	}

	private static long getObjectItem(List<String> lstObj) {

		long startTime = System.nanoTime();

		for (int i = 0; i < lstObj.size(); i++) {
			lstObj.get(i);
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		return duration;

	}
}