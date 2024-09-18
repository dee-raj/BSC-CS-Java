class area {
    int a,b;
    area(int x, int y){
        a=x; b=y;
    }
    int ap(){
        int ar=a*b;
        System.out.println(ar);
        return ar;
    }
    public static void main(String[] args){
        area p=new area(2,4);
        p.ap();
    }
}
