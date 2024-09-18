public class runnable implements Runnable{
    public void run(){
        System.out.println("Hello from runnable thread.");
    }
    public static void main(String[] args) {
        (new Thread(new runnable())).start();

        //added
        new simpleThread("Raj").start();
        new simpleThread("Dee").start();
    }    
}


class simpleThread extends Thread{
    public simpleThread(String str){
        super(str);
    }
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(i+" "+ getName());
            try{
                sleep((int)(Math.random()*1000));
            }catch(InterruptedException ex){
                System.out.println("Program interrupted.");
            }
        }
        System.out.println("Exit! "+ getName());
    }
}