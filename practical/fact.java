import java.util.Scanner;
class fact{
    public static void main(String[] args) {
        int n,f=1;
        System.out.print("Enter a number: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for (int i=1; i<=n; i++){
            f=f*i;
            //System.out.println("factorial: "+f);
        }
        System.out.print("factorial: "+f);
    }
}