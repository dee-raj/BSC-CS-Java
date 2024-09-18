class Rectangle
{
    int length;
    int width;
    void getData(int x, int y)
    {
        length=x;
        width=y;
    }
    int rectarea()
    {
        int area=length*width;
        return (area);
    }
}
class Reactarea
{
    public static void main(String[] args)
    {
        int area1,area2;
        Rectangle react1 = new Rectangle();
        Rectangle react2 = new Rectangle();
        react1.length=11;
        react2.width=13;
        area1=react1.length*react2.width;
        react2.getData(23,10);
        area2=react2.rectarea();
        System.out.println("Area1= "+area1);
        System.out.println("Area2= "+area2);
    }
}