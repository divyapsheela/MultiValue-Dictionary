package com.multivaluedictionary;
import java.util.*;

public class Functionalities {
	
	static HashMap<String, List<String>> MultiValDict = new HashMap<String,List<String>>(); //Dictionary data structure
	
	//Adding default values to dictionary for easy testing
	public static void AddDefaultMembers() {
		List<String> values = new ArrayList<String>();
		values.add("Ford");
		values.add("Honda");
		values.add("Toyota");
		MultiValDict.put("Automobile", values);
		List<String> value1 = new ArrayList<String>();
		value1.add("Apple");
		value1.add("Orange");
		MultiValDict.put("Fruits", value1);
	}
	
	//KEYS
	//Returns all the keys in the dictionary. Order is not guaranteed.
	public static void Keys() {
		Collection<String> keyList = MultiValDict.keySet();
		if(keyList == null)
			return;
		else {
			int count = 1;
			for(String key: keyList) {
				System.out.println(count+ ") " + key);
				++count;
			}
		}	
	}
	
	
//	MEMBERS
//	Returns the collection of strings for the given key. Return order is not guaranteed. Returns an error if the key does not exists
	public static void Members(String key) {
		List<String> memberList = MultiValDict.get(key);
		if(memberList == null) {
			System.out.println(") ERROR, key does not exist.");	
		}
		else {
			int count = 1;
			for(String mem: memberList) {
				System.out.println(count+ ") " + mem);
				++count;
			}
		}
	}
	
	//ADD
	//Adds a member to a collection for a given key. Displays an error if the member already exists for the key
	public static void Add(String key , String val) {
		List<String> memberList = MultiValDict.get(key);
		if(memberList == null) {
			memberList = new ArrayList<String>();
			memberList.add(val);
			MultiValDict.put(key,memberList);
			System.out.println(") Added");
		}
		else {
			if(memberList.contains(val))
				System.out.println(") ERROR, member already exists for key");
			else {
				memberList.add(val);
				System.out.println(") Added");
			}
		}

	}

	
//	REMOVE
/*	Removes a member from a key. If the last member is removed from the key, the key is removed from the dictionary. If the key or member does not exist, displays an
	error */
	public static void Remove(String key, String val) {
		
		if(!MultiValDict.containsKey(key)) {
			System.out.println(") ERROR, key does not exist.");	
		}
		else {
			List<String> memberList = MultiValDict.get(key);	
			if(memberList.contains(val)) {
					memberList.remove(val);
					System.out.println(") Removed");
					if( MultiValDict.get(key) == null)
						MultiValDict.remove(key);
				}
				else
					System.out.println(") ERROR, member does not exist");
		}	
	}
	
//	REMOVEALL
//	Removes all members for a key and removes the key from the dictionary. Returns an error if the key does not exist
	public static void RemoveAll(String key) {
		
		if(!MultiValDict.containsKey(key)) {
			System.out.println(") ERROR, key does not exist");
		}
		else {
			MultiValDict.remove(key);
			System.out.println(") Removed");
		}
	}
	
//	CLEAR
//	Removes all keys and all members from the dictionary
	public static void Clear() {
		Collection<String> keyList = MultiValDict.keySet();
		for(String key: keyList) {
			MultiValDict.remove(key);
		}
		System.out.println(") Cleared");
	}
	
	
//	KEYEXISTS
//	Returns whether a key exists or not
	public static void KeyExists(String key) {
		if(MultiValDict.containsKey(key))
			System.out.println(") true");
		else
			System.out.println(") false");
	}
	
//	MEMBEREXISTS
//	Returns whether a member exists within a key. Returns false if the key does not exist.
	
	public static void MemberExists(String key, String val) {
		List<String> memberList = MultiValDict.get(key);	
		if(memberList.contains(val)) 
			System.out.println(") true");
		else
			System.out.println(") false");
	}
	
//	ALLMEMBERS
//	Returns all the members in the dictionary. Returns nothing if there are none. Order is not guaranteed
	public static void AllMembers() {
		Collection<String> keyList = MultiValDict.keySet();
		List<String> memberList = new ArrayList<String>();
		int count = 1;
		for(String key: keyList) {
			memberList = MultiValDict.get(key);
			for(String val: memberList) {
				System.out.println(count + ") "+ val);
				++count;
			}
		}
	}
	
//	ITEMS
//	Returns all keys in the dictionary and all of their members. Returns nothing if there are none. Order is not guaranteed.
	public static void Items() {
		Collection<String> keyList = MultiValDict.keySet();
		if(keyList == null) {
			return;
		}
		int count = 1;
		List<String> memberList = new ArrayList<String>();
		for(String key: keyList) {
			memberList = MultiValDict.get(key);
			for(String val: memberList) {
				System.out.println(count + ") "+key + ": "+ val);
				++count;
			}
		}
	}


}
