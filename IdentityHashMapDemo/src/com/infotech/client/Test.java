package com.infotech.client;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		 // Creating HashMap and IdentityHashMap objects
        Map<String, Integer> hm = new HashMap<String, Integer>();
        Map<String, Integer> ihm = new IdentityHashMap<String, Integer>();
 
        // Putting key and value in HashMap and IdentityHashMap Object
        hm.put("Kishan",30);
        hm.put(new String("Kishan"),31); 
        
        ihm.put("Sean",35); 
        ihm.put(new String("Sean"),36); 
         
        //hm.size() will print 1 since it compares the objects logically and both the keys are same
        System.out.println("Size of HashMap::"+hm.size());
         
        //ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap::"+ihm.size());
	}
}
