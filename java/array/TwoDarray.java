import java.util.Arrays;
import java.util.Scanner;
class TwoDarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=sc.nextInt();
            
        System.out.print("Enter no of cols:");
        int cols=sc.nextInt();
               
            int[][] arr=new int[rows][cols];
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    System.out.print("Enter ("+(i+1)+","+(j+1)+") elements:");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(Arrays.deepToString(arr));
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i][0];
        }
        System.out.println("The sum of rows: "+sum);
        
    }
}