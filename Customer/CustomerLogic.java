package by.it_academy.tr.object.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.*;

public class CustomerLogic 
{
	Map<String,Customer> map = new TreeMap<>();
	List<Customer> customerlist = new ArrayList<>();

	public void customerAdd(String name,Customer co) 
	{
		map.put(name , co);
		customerlist.add(co);
	}
	
	public void CustomerAlphabetOrder()
	{	
		for(Map.Entry<String,Customer> entry : map.entrySet()) 
		{
			System.out.println(entry.getValue());
		}
	}
	
	public void listCreditNumber(Predicate<Customer> t) 
	{
		for(Customer s:customerlist) 
		{
			if(t.test(s)) 
			{
				System.out.println(s);
			}
		}
	}
}
