
public class innerclassassisted1 {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", please start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerclassassisted1 obj=new innerclassassisted1();
		innerclassassisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


