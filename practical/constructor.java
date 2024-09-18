import java.util.Scanner;
class p {
    int a,b;
    Scanner s=new Scanner(System.in);
    p(){
        System.out.print("1st side : ");
        a=s.nextInt();
        System.out.print("2nd side : ");
        b=s.nextInt();
    }
    p(int x, int y){
        b=y;
        a=x;
    }
    int cp(){
        int para=2*(a+b);
        return para;
    }
}
class tester{
    public static void main(String args[]){
        p c=new p();
        System.out.println("1st: "+c.cp());
        p d=new p();
        System.out.println("2nd: "+d.cp());
    }
}