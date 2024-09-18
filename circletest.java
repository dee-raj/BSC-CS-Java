import java.lang.Exception;
class InvalidRadiusException extends Exception
{ private double r;
public InvalidRadiusException(double radius){
r=radius;
}
public void pintError(){
System.out.println("Radius ["+r+"] is not valid");
}
}
class circle
{ double x,y,r;
public circle(double centrex, double centrey, double radius)throws InvalidRadiusException {
if(r<=0){
throw new InvalidRadiusException(radius);
}
else{
x= centrex; y=centrey; r=radius;
}
}
}
class circletest
{ public static void main(String args[])
{ try{
circle c=new circle(10,10,-1);
System.out.println("Circle created");
}
catch (InvalidRadiusException e){
e.pintError();
}
}
}