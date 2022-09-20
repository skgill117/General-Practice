package com.shiv;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<Employee, String> map = new HashMap();
		//map.put(null, null);
		//map.put(null, "ttt");
		
		map.put(new Employee(1,"shiv",28,"skgill"), "test");
		map.put(new Employee(2,"ankur",30,"ankur77"), "test");
		map.put(new Employee(1,"shiv",28,"skgill"), "test");
		map.put(new Employee(1,"shiv",28,"skgill"), "test2");
		System.out.println(map.get(new Employee(1,"shiv",28,"skgill")));
		
		System.out.println(map);
		
		map.entrySet().forEach(s-> System.out.println(s.getKey().getEmpId() + "--" + s.getValue()));

	}

}
