
public class myrunnablethread {

    public static int myCount = 0;
    public myrunnablethread(){
         
    }
    public void run() {
        while(myrunnablethread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++myrunnablethread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        myrunnablethread mrt = new myrunnablethread();
        thread t = new thread(mrt);
        t.start();
        while(myrunnablethread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++myrunnablethread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}





