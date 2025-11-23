class sum
{
    public int sum(int x,int y)
    {
        return (x+y);
    }
    public int sum (int x,int y, int z)
    {
        return (x+y+z);
    }
    public double sum (double x , double y)
    {
        return (x+y);
    }
}
class Overloading
{
    public static void main(String [] args) {
        sum s = new sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5,20.5));
    }
}