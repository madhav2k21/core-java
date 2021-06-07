package com.techleads.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add(".Net");
		list.add("Python");
		list.add("springboot");
		list.add("php");
		
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		
		unmodifiableList.forEach(System.out::println);
		
		unmodifiableList.add("test"); //java.lang.UnsupportedOperationException
	}

}
