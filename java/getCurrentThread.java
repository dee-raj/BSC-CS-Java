import java.util.Scanner;
public class getCurrentThread {
    static Thread _thread = Thread.currentThread();
    
    static Scanner sc=new Scanner(System.in);
    static void setName(){
        System.out.print("Enter Thread name:");
        String na=sc.nextLine();
        _thread.setName(na);
    }
    public static void main(String[] draj) {
        setName();
        System.out.println("id="+_thread.getId());

        System.out.println("Name="+_thread.getName());

        System.out.println("Priority="+_thread.getPriority());

    }
}
