class Rectangle
{
    int length , breadth;

    Rectangle(int i , int j)
    {
        length = i;
        breadth = j;
    }
    Rectangle(Rectangle c)
    {
        System.out.println("Copy Constructor Invoed");
        length = c.length;
        breadth = c.breadth;

    }
    int area()
    {
        return length*breadth;
    }

}
class CP
{
    public static void main (String [] args){
        Rectangle r1 = new Rectangle(5,6);
        Rectangle r2 = new Rectangle(r1);
        System.out.println("Area of Rectangle 1 :"+r1.area());
        System.out.println("Area of Rectangle 2 :"+r2.area());
    }
}