package com.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String args[])
	{
		List<String> ll = new ArrayList<String>();
		ll.add("abc");
		ll.add("def");
		ll.add("mno");
		ll.add("ert");
		ll.add("qwe");
		
		Stream <String> stream1= ll.stream();
		
		long count = stream1
	            .map((value) -> { return value.toLowerCase(); })
	            .count();
		Stream <String>  stringStream = stream1
				.map((value) -> {return value.toLowerCase();});
			
		System.out.println("count is " + count);
		System.out.println("count is " + stringStream.toString());
		
		
		
	}

}
