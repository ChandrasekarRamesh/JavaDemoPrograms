package org.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Employee {
	public static void main(String[] args) {
		Map<String, Company> m = new HashMap<String, Company>();
		Company c = new Company();
		c.setEmpId(101);
		c.setEmpName("Greens Tech");
		c.setEmpPhn(987637628l);
		
		Company c1 = new Company();
		c1.setEmpId(102);
		c1.setEmpName("TCS");
		c1.setEmpPhn(8137893732l);
		m.put("1st Emp Info",c);
		m.put("2nd Emp Info", c1);
		
		Set<Entry<String, Company>> e = m.entrySet();
		
		for (Entry<String, Company> emp : e) {
			
		System.out.println(emp.getKey());
				
		System.out.println(emp.getValue().getEmpId());
		System.out.println(emp.getValue().getEmpName());
		System.out.println(emp.getValue().getEmpPhn());
		}
		
		
		
	}
	
	
	
}
