public class Synchronized{
    public static void main(String[] args) {
        callThread target= new callThread();
        caller obj1 = new caller(target, "Thread A");
        caller obj2 = new caller(target, "Thread b");
        caller obj3 = new caller(target, "Synchronized");
        caller obj4 = new caller(target, "Thread c");
        caller obj5 = new caller(target, "Thread d");
        caller obj6 = new caller(target, "Synchronized");
        caller obj7 = new caller(target, "Thread 1");
        caller obj8 = new caller(target, "Thread 2");
        caller obj9 = new caller(target, "Thread 3");
        caller obj10 = new caller(target, "Synchronized");
        caller obj11 = new caller(target, "Thread 4");
        caller obj12 = new caller(target, "Thread 5");

        try{
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
            obj4.thread.join();
            obj5.thread.join();
            obj6.thread.join();
            obj7.thread.join();
            obj8.thread.join();
            obj9.thread.join();
            obj10.thread.join();
            obj11.thread.join();
            obj12.thread.join();
        }catch(InterruptedException ex){
            System.out.println("Program interrupted.\n"+ex);

        }
    }

}
class callThread{
    void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
            System.out.println(ex+"\nprogram Interrupted");
        }
        System.out.println("]");
    }
}
class caller implements Runnable{
    
    String msg;
    Thread thread;
    callThread target;
    caller(callThread targ,String str){
        target=targ;
        msg=str;
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        synchronized(target){
            target.call(msg);
        }
    }    

}