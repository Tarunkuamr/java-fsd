import java.util.*;
public class collections {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("hyderabad");//
	      city.add("bangalore");    	   
	      System.out.println(city);  
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(18); 
	      vec.addElement(36); 
	      System.out.println(vec);
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("vicky");  
	      names.add("rony");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());   
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(91);  
	       set.add(93);  
	       set.add(92);
	       set.add(94);
	       System.out.println(set);
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(15);  
	       set2.add(16);  
	       set2.add(17);
	       set2.add(18);	       
	       System.out.println(set2);
	      	} 
	      }  

}
	 
	      
	      



