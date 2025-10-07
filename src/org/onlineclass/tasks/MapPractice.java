package org.onlineclass.tasks;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<String,Integer> hm=new HashMap();
//hm.put("name", "kala");
//hm.put("age", 23);
//hm.put(null, "null");
//hm.put(null, "null");
//hm.put("name", "mala");
//System.out.println(hm);
//HashMap hm2=new HashMap();
//hm2.put("name", "Bala");
//hm2.put("age", 32);
//hm2.put("height", 5.5);
//
//System.out.println("*************************************");
//hm.putAll(hm2);
//System.out.println(hm);
//System.out.println("---------------------------");
//System.out.println(hm.containsKey("name"));
//System.out.println(hm.containsValue("mala"));
//System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
//System.out.println(hm.remove("name"));
//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//Object obj = hm.get("age");
//System.out.println(obj);
//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//System.out.println(hm.values());
//System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
//Set keys = hm.keySet();
//System.out.println(keys);
////LinkedHashMap lm=new LinkedHashMap();
////lm.put("name", "kala");
////lm.put("age", 23);
////lm.put(null, "null");
////lm.put(null, "null");
////lm.put("name", "mala");
////System.out.println(lm);
////TreeMap tm=new TreeMap();
////tm.put("name", "kala");
////tm.put("age", 23);
////tm.put("Height", "null");
////tm.put("Weight", "null");
////tm.put("name", "mala");
////System.out.println(tm);
//for (Map.Entry<String, Integer> en : hm.entrySet()) {
//	String key = en.getKey();
//	Integer val = en.getValue();
//	
//}
//System.out.println("00000000000000000000000000000000000000");
HashMap<Integer,String> hm3=new HashMap<>();
hm3.put(101, "Siva");
hm3.put(102,"Arun");
hm3.put(103, "Raja");
System.out.println(hm3);
System.out.println("00000000000000000000000000000000000000");
Hashtable<Integer,String> hm4=new Hashtable<Integer,String>();
hm4.put(101, "Siva");
hm4.put(102,"Arun");
hm4.put(103, "Raja");
for (Map.Entry<Integer, String> entry : hm4.entrySet()) {
	Integer key = entry.getKey();
	String val = entry.getValue();
	System.out.println(key+val);
	
}

//System.out.println(hm3);

	}

}
