interface newshape
{ void draw();
int radius=10;
}
class newcircle implements newshape
{ public void draw()
{ System.out.println("Radius:"+radius);
}
}
class inter
{public static void main(String args[])
{ newcircle l=new newcircle();
l.draw();
}
}