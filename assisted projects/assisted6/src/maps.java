import java.util.*;
public class maps {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"harry");    
	      hm.put(2,"ron");    
	      hm.put(3,"teo");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"casey");  
	      ht.put(5,"lilly");  
	      ht.put(6,"rj");  
	      ht.put(7,"domnic");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"jack");    
	      map.put(9,"sky");    
	      map.put(10,"vicky");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}



	
