package SeleniumSession;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapHashTable {

	public static void main(String[] args) 
	{
		//HashMap<String,String> userMap =new HashMap<String,String>();
		Map<String,String> userMap =new HashMap<String,String>();
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Banglore");
		userMap.put(null, "pune");
		userMap.put(null, "hyd");//only null key and multiple null values in hashmap
		userMap.put("company", null);
		userMap.put("country", null);
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());
		
		for(Map.Entry m :userMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//hashtable
		
		Hashtable<String,Integer> productTable=new Hashtable<String,Integer>();
		productTable.put("Apple Macbook", 2000);
		productTable.put("window hp lapy", 3000);
		productTable.put("Apple iphonex", 6000);
        //productTable.put(null,null); //no null key and null values in hashtable
		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));
		
		for(Map.Entry m: productTable.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
//hashmap is non synchronized---- not thread safe...
	}

}
