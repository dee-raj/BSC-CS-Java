class arrayex
{  public static void main(String args[]){  
int a[]={10,20,30};
try{
a[10]=5;
}
catch(ArrayIndexOutOfBoundsException e)
{ System.out.println("Index 10 out of bound for length 3:"+e.getMessage());
}
}
}