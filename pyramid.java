public class pyramid {
 public static void main(String[] args){
    int size=5;
    int alpha=65;

    //upper pyramid
    for (int i=1; i<=size; i++){
        //printing spaces
        for (int j=size; j>i;j--){
            System.out.print(" ");
        }
        //printing alphabets
        for (int k=0; k<i*2-1;k++){
            System.out.print((char)(alpha+k));
        }
        System.out.println();
    }
    //lower pyramid
    for (int i=1; i<=size-1;i++){
        //printing spaces
        for (int j=0;j>i;j++){
            System.out.print(" ");
        }
        //printing alphabets
        for (int k=0;k<(size-i)*2-1;k++){
            System.out.print((char)(alpha+k));
        }
        System.out.println();
    }
 } 
}