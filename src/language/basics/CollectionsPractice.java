package language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {
		//list, set and map
//arraylist, linkedlist, hashset, linkedset and treeset, hashmap, linkedhashmap, treemap and hashtable 		
		
		List<String> varliabl = new ArrayList<String>();
		List<String> empNamesArrayList = new ArrayList<String>();
		
			empNamesArrayList.add("Kiran");
	        empNamesArrayList.add("Sravanthi");
	        empNamesArrayList.add("Mahendra");
	        empNamesArrayList.add("Vaishali");
	        empNamesArrayList.add("Kiran");
	        empNamesArrayList.add("Bharath");
	        empNamesArrayList.remove("Bharath");
	        empNamesArrayList.add(null);
		
	        System.out.println(empNamesArrayList);
	        System.out.println();        
	     
	  List<String> empNameLinkedList1 = new LinkedList<String>();
	  empNameLinkedList1.add("Kiran");
	  empNameLinkedList1.add("Sravanthi");
      empNameLinkedList1.add("Mahendra");
      empNameLinkedList1.add("Vaishali");
      empNameLinkedList1.add("Kiran");
      empNameLinkedList1.add("Bharath");
      empNameLinkedList1.remove("Bharath");
      empNameLinkedList1.add(null);
      System.out.println(empNameLinkedList1);
      
      
      // List<DataType> Variable = new HashSet<DataType>();

      Set<String> empNamesHashSet = new HashSet<String>();
      empNamesHashSet.add("Kiran");
      empNamesHashSet.add("Sravanthi");
      empNamesHashSet.add("Mahendra");
      empNamesHashSet.add("Vaishali");
      empNamesHashSet.add("Kiran");
      empNamesHashSet.add("Bharath");
      empNamesHashSet.remove("Bharath");
      empNamesHashSet.add(null);
      
      System.out.println(empNamesHashSet);
      System.out.println(); 
      
      // List<DataType> Variable = new LinkedHashSet<DataType>();

      Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
      empNamesLinkedHashSet.add("Kiran");
      empNamesLinkedHashSet.add("Sravanthi");
      empNamesLinkedHashSet.add("Mahendra");
      empNamesLinkedHashSet.add("Vaishali");
      empNamesLinkedHashSet.add("Kiran");
      empNamesLinkedHashSet.add("Bharath");
      empNamesLinkedHashSet.remove("Bharath");
      empNamesLinkedHashSet.add(null);
      
      System.out.println(empNamesLinkedHashSet);
      System.out.println();
      
      // List<DataType> Variable = new TreeSet<DataType>();

      Set<String> empNamesTreeSet = new TreeSet<String>();
      empNamesTreeSet.add("Kiran");
      empNamesTreeSet.add("Sravanthi");
      empNamesTreeSet.add("Mahendra");
      empNamesTreeSet.add("Vaishali");
      empNamesTreeSet.add("Kiran");
      empNamesTreeSet.add("Bharath");
      empNamesTreeSet.remove("Bharath");
   //   empNamesTreeSet.add(null);
      
      System.out.println(empNamesTreeSet);
      System.out.println();
      

		
	}

}
 