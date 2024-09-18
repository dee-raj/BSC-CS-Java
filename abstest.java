

import java.util.Scanner;
abstract class solid{
   double radius;
   public abstract void surfacearea();
   public abstract void volume();
   public abstract void readradius();
   public double basearea(double r){
      double p;
      p=Math.PI*r*r;
      return p;
   } 
}

class cylinder extends solid{
   double height;
   public cylinder(double h){
      height = h;
   }
   public void readradius(){
      Scanner c=new Scanner(System.in);
      System.out.println("Enter the radius (cylinder):");
      radius=c.nextInt();
      c.close();
   }
   public void surfacearea(){
      double barea;
      double tot_area;
      barea=basearea(radius);
      tot_area=2+Math.PI*radius*height+2*barea;
      System.out.println("\n Surface area of cylinder is :"+tot_area );
   }
   public void volume(){
      System.out.println("\n volume of cylinder is:"+height*(basearea(radius))*1/3);
   }
}
class cone extends solid{
   double height;
   public cone(double h){
      height = h;
   }
   public void readradius(){
      Scanner c=new Scanner(System.in);
      System.out.println("Enter the radius (Cone):");
      radius=c.nextInt();
      c.close();
   }
   public void surfacearea(){
      double barea;
      double tot_area;
      barea=basearea(radius);
      tot_area=Math.PI*(radius*radius)+(height*barea)*1/2 ;
      System.out.println("\n Surface area of cone is :"+tot_area );
   }
   public void volume(){
      System.out.println("\n volume of cone is:"+Math.PI*height*radius*radius*1/3);
   }
}
class sphere extends solid{
   double height;
   public sphere(double h){
      height = h;
   }
   public void readradius(){
      Scanner c=new Scanner(System.in);
      System.out.println("Enter the radius (Sphere):");
      radius=c.nextInt();
      c.close();
   }
   public void surfacearea(){
      double tot_area;
      tot_area=4*Math.PI*radius*radius;
      System.out.println("\n Surface area of sphere is :"+tot_area );
   }
   public void volume(){
      System.out.println("\n volume of sphere is:"+4/3*Math.PI*radius*radius*radius*1/3);
   }
}
class abstest{
   public static void main(String args[]){
      cylinder c=new cylinder(3);
      c.readradius();
      c.surfacearea();
      c.volume();

      cone co=new cone(3);
      co.readradius();
      co.surfacearea();
      co.volume();

      sphere s=new sphere(3);
      s.readradius();
      s.surfacearea();
      s.volume();
   }
}