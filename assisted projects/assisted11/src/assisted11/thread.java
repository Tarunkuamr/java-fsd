package assisted11;

public class thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
    }
	public static void main( String args[] )
 	{
  		Mythread mt = new  Mythread();
  		mt.start();
 	}
}



